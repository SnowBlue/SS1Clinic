package core.clientservercommunication;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

/**
 * Created by Kenny on 2/1/2015.
 */
@ServerEndpoint("/endpoint")
class ServerReceiver {
    public void onMessage(String message, Session session) throws IOException, EncodeException {
        WebResponse request = new WebResponse();
        request.loadFromRaw(message);
        ServerResponseHandler responseHandler = new ServerResponseHandler();
        WebResponse response = responseHandler.handle(request);
        session.getBasicRemote().sendText(response.toString());
    }

}
