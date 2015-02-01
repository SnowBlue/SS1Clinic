package core.clientservercommunication.protocol;

import core.clientservercommunication.message.Message;
import core.clientservercommunication.protocol.ResponseStatus;
import core.user.Session;

/**
 * Created by Kenny on 2/1/2015.
 */
public class WebResponse {
    private Message message;
    private Session userSession;
    private ResponseStatus status;
    private String errorMessage;
    public void loadFromRaw(String rawData){


    }
    public String convertToRaw(){return "";}
    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Session getUserSession() {
        return userSession;
    }

    public void setUserSession(Session userSession) {
        this.userSession = userSession;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
