package core.clientservercommunication.protocol;

import core.clientservercommunication.*;
import core.clientservercommunication.message.Message;

import javax.websocket.*;
import java.net.URI;

/**
 * Created by Kenny on 2/1/2015.
 */
class CommunicationRequest {
    private final String serverEndpoint;
    private final int serverPort;

    protected CommunicationRequest(String serverEndpoint,
                               int serverPort){
        this.serverEndpoint = serverEndpoint;
        this.serverPort = serverPort;
    }
    protected static Session persistentSession;
    protected void establishPersistentConnection() throws Exception {
        while (CommunicationRequest.persistentSession == null || !CommunicationRequest.persistentSession.isOpen())
        {
            WebSocketContainer webSocketContainer = ContainerProvider.getWebSocketContainer();
            webSocketContainer.connectToServer(this, new URI(serverEndpoint));
            Thread.sleep(5000);
        }
    }
    @OnOpen
    public void onOpen(Session session) {
        this.persistentSession = session;
    }
    public void send(final Message message, core.user.Session userSession,
                     BaseRequestCallback successCallback) throws Exception {
        establishPersistentConnection();
        WebResponse request = new WebResponse();
        request.setUserSession(userSession);
        request.setMessage(message);
        request.setStatus(ResponseStatus.Success);
        persistentSession.addMessageHandler(successCallback);
        persistentSession.getBasicRemote().sendText(request.convertToRaw());
    }
}
