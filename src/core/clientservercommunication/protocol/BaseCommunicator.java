package core.clientservercommunication.protocol;

import core.clientservercommunication.*;
import core.clientservercommunication.message.Message;

/**
 * Created by Kenny on 2/1/2015.
 * Package-private class
 */
public abstract class BaseCommunicator {
    private final String serverEndpoint;
    private final int serverPort;
    private core.user.Session userSession;

    protected BaseCommunicator(String serverEndpoint,
                               int serverPort,
                               core.user.Session userSession
                               ){
        this.serverEndpoint = serverEndpoint;
        this.serverPort = serverPort;
        this.userSession = userSession;
    }
    public void send(Message message, BaseRequestCallback callback) throws Exception {
        CommunicationRequest request = new CommunicationRequest(serverEndpoint,
        serverPort);
        request.send(message, userSession, callback);
    }
}
