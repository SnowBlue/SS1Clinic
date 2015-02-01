package core.clientservercommunication;

import com.sun.corba.se.spi.activation.Server;

/**
 * Created by Kenny on 2/1/2015.
 * Class used to communicate to server. User is acting as client.
 */
public class ServerCommunicator extends BaseCommunicator {
    public ServerCommunicator(){
        super("http://ss1clinic.app.com", 80);
    }
}
