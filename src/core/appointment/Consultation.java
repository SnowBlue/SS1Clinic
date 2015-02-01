package core.appointment;

import core.user.Consultant;
import core.user.Patient;

import org.joda.time.*;
import java.util.List;

/**
 * Created by Kenny on 2/1/2015.
 */
public class Consultation {
    DateTime startTime;
    Interval length;
    ConsultationType consultationType;
    List<Consultation> relatedConsultations;
    Patient patient;
    Consultant consultant;
    String diagnosis;
    String medication;
    String comments;
    double consultationFee;
    double medicationFee;
}
