package core.clientservercommunication;

/**
 * Created by Kenny on 2/1/2015.
 */
public enum RequestType {
    AppointmentBook, AppointmentChange, AppointmentCancel,
    PatientRegistration, PatientUpdate, PatientDelete,
    ConsultantAdd, ConsultantDelete,
    ConsultationAdd, ConsultationChange, ConsultationDelete,
    SessionLogin, SessionAuthentication
}
