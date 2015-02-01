package core.clientservercommunication.message;

import core.user.Session;

/**
 * Created by Kenny on 2/1/2015.
 */
public class Message {
    private String content;
    private RequestType requestType;
    private core.user.Session userSession;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public Session getUserSession() {
        return userSession;
    }

    public void setUserSession(Session userSession) {
        this.userSession = userSession;
    }
}
