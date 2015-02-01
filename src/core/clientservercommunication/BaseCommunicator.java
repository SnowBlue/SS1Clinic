package core.clientservercommunication;

import core.clientservercommunication.message.Message;
import core.user.*;

import javax.websocket.*;
import javax.websocket.Session;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Kenny on 2/1/2015.
 * Package-private class
 */
@ClientEndpoint
abstract class BaseCommunicator {
    private final String serverEndpoint;
    private final int serverPort;

    protected BaseCommunicator(String serverEndpoint,
                               int serverPort){
        this.serverEndpoint = serverEndpoint;
        this.serverPort = serverPort;
    }
    protected static Session persistentSession;
    protected void establishPersistentConnection() throws Exception {
        WebSocketContainer webSocketContainer = ContainerProvider.getWebSocketContainer();
        webSocketContainer.connectToServer(this, new URI(serverEndpoint));
    }
    @OnOpen
    public void onOpen(Session session) {
        this.persistentSession = session;
    }

    public WebResponse Send(Message message, core.user.Session userSession,
                                 ICallback failedConnectionCallback, ICallback successCallback) throws Exception {
        while (BaseCommunicator.persistentSession == null || !BaseCommunicator.persistentSession.isOpen())
        {
            establishPersistentConnection();
            Thread.sleep(5000);
            if (BaseCommunicator.persistentSession == null || !BaseCommunicator.persistentSession.isOpen())
                failedConnectionCallback.callback();
        }
        WebResponse request = new WebResponse();
        request.setUserSession(userSession);
        request.setMessage(message);
        request.setStatus(ResponseStatus.Success);
        persistentSession.getBasicRemote().sendText(request.convertToRaw());

        return request;
    }
}
