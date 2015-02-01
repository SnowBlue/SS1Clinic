package core.clientservercommunication.protocol;

import core.clientservercommunication.*;

import javax.websocket.MessageHandler;
import java.util.concurrent.CountDownLatch;

/**
 * Created by Kenny on 2/1/2015.
 */
public abstract class BaseRequestCallback implements MessageHandler.Whole<String> {
    abstract void successCallback(WebResponse response);
    abstract void failureCallback(WebResponse response);
    @Override
    public void onMessage(String message){
        WebResponse response = new WebResponse();
        response.loadFromRaw(message);
        if (response.getStatus() == ResponseStatus.Success) successCallback(response);
        else failureCallback(response);
    }
}
