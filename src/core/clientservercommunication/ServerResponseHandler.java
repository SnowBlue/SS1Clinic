package core.clientservercommunication;

/**
 * Created by Kenny on 2/1/2015.
 */
class ServerResponseHandler {
    public ServerResponseHandler(){

    }
    public WebResponse handle(WebResponse request){
        WebResponse response = new WebResponse();
        switch (response.getMessage().getRequestType()){
            case AppointmentBook:
                break;
            default:
                break;
        }
        return response;
    }
}
