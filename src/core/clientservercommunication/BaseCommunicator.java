package core.clientservercommunication;

import javax.websocket.*;
/**
 * Created by Kenny on 2/1/2015.
 * Package-private class
 */
class BaseCommunicator {
    protected static Session PersistentSession;
    protected void EstablishPersistentConnection(){

    }

    public Message Send(Message message){
        if (BaseCommunicator.PersistentSession == null || !BaseCommunicator.PersistentSession.isOpen())
            EstablishPersistentConnection();
        Message response = new Message();
        return response;
    }
}
