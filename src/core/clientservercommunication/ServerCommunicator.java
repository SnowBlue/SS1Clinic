package core.clientservercommunication;

import core.clientservercommunication.protocol.BaseCommunicator;
import core.user.Session;

/**
 * Created by Kenny on 2/1/2015.
 * Class used to communicate to server. User is acting as client.
 */
public class ServerCommunicator extends BaseCommunicator {
    static String serverUrl = "http://ss1clinic.app.com";
    static int serverPort = 80;
    public ServerCommunicator(){
        super(serverUrl, serverPort, null);
    }
    public ServerCommunicator(Session userSession){
        super(serverUrl, serverPort, userSession);
    }

}
