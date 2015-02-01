package core.clientservercommunication;

import core.clientservercommunication.protocol.WebResponse;

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
            case AppointmentCancel:
                break;
            case AppointmentChange:
                break;
            case SessionAuthentication:
                break;
            case PatientRegistration:
                break;
            case PatientUpdate:
                break;
            case PatientDelete:
                break;
            default:
                break;
        }
        return response;
    }
}
