package core.user;

import core.appointment.Appointment;

import java.util.*;
import org.joda.time.DateTime;

/**
 * Created by Kenny on 2/1/2015.
 */
public class Patient extends User {
    private String firstName;
    private String lastName;
    private String nationality;
    private String address;
    private String identificationNumber;
    private String bloodType;
    private String allergies;
    private String email;
    private String contactNumber;
    private String currentMedication;
    private Gender gender;
    private DateTime dateOfBirth;
    private List<Consultant> pastConsultations;
    private List<Appointment> currentAppointments;
    private String religion;
    private String maritalStatus;
    private String nextOfKinName;
    private String nextOfKinRelationship;
    private String nextOfKinContactInformation;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCurrentMedication() {
        return currentMedication;
    }

    public void setCurrentMedication(String currentMedication) {
        this.currentMedication = currentMedication;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Consultant> getPastConsultations() {
        return pastConsultations;
    }

    public void setPastConsultations(List<Consultant> pastConsultations) {
        this.pastConsultations = pastConsultations;
    }

    public List<Appointment> getCurrentAppointments() {
        return currentAppointments;
    }

    public void setCurrentAppointments(List<Appointment> currentAppointments) {
        this.currentAppointments = currentAppointments;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNextOfKinName() {
        return nextOfKinName;
    }

    public void setNextOfKinName(String nextOfKinName) {
        this.nextOfKinName = nextOfKinName;
    }

    public String getNextOfKinRelationship() {
        return nextOfKinRelationship;
    }

    public void setNextOfKinRelationship(String nextOfKinRelationship) {
        this.nextOfKinRelationship = nextOfKinRelationship;
    }

    public String getNextOfKinContactInformation() {
        return nextOfKinContactInformation;
    }

    public void setNextOfKinContactInformation(String nextOfKinContactInformation) {
        this.nextOfKinContactInformation = nextOfKinContactInformation;
    }
}
