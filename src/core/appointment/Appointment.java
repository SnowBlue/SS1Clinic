package core.appointment;
import core.user.*;

import org.joda.time.*;

/**
 * Created by Kenny on 2/1/2015.
 */
public class Appointment {
    DateTime requestDate;
    DateTime meetingDate;
    Interval length;
    ConsultationType consultationType;
    Patient patient;
    Consultant consultant;
    String patientComments;
    String consultantComments;
    boolean isApproved;
    boolean isFulfilled;
    boolean isCancelled;
    boolean isModified;

}
