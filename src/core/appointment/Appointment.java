package core.appointment;
import core.user.*;

import org.joda.time.*;

/**
 * Created by Kenny on 2/1/2015.
 */
public class Appointment {
    private DateTime requestDate;
    private DateTime meetingDate;
    private Interval length;
    private ConsultationType consultationType;
    private Patient patient;
    private Consultant consultant;
    private String patientComments;
    private String consultantComments;
    private boolean isApproved;
    private boolean isFulfilled;
    private boolean isCancelled;
    private boolean isModified;

    public DateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(DateTime requestDate) {
        this.requestDate = requestDate;
    }

    public DateTime getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(DateTime meetingDate) {
        this.meetingDate = meetingDate;
    }

    public Interval getLength() {
        return length;
    }

    public void setLength(Interval length) {
        this.length = length;
    }

    public ConsultationType getConsultationType() {
        return consultationType;
    }

    public void setConsultationType(ConsultationType consultationType) {
        this.consultationType = consultationType;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public void setConsultant(Consultant consultant) {
        this.consultant = consultant;
    }

    public String getPatientComments() {
        return patientComments;
    }

    public void setPatientComments(String patientComments) {
        this.patientComments = patientComments;
    }

    public String getConsultantComments() {
        return consultantComments;
    }

    public void setConsultantComments(String consultantComments) {
        this.consultantComments = consultantComments;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public boolean isFulfilled() {
        return isFulfilled;
    }

    public void setFulfilled(boolean isFulfilled) {
        this.isFulfilled = isFulfilled;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    public boolean isModified() {
        return isModified;
    }

    public void setModified(boolean isModified) {
        this.isModified = isModified;
    }
}
