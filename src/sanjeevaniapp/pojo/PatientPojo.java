/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.pojo;

import java.sql.Date;

/**
 *
 * @author Ramkumar
 */
public class PatientPojo {

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMarriedStatus(String marriedStatus) {
        this.marriedStatus = marriedStatus;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setOpd(String opd) {
        this.opd = opd;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public void setAptStatus(String aptStatus) {
        this.aptStatus = aptStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getGender() {
        return gender;
    }

    public String getMarriedStatus() {
        return marriedStatus;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getMno() {
        return mno;
    }

    public Date getDate() {
        return date;
    }

    public String getOpd() {
        return opd;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public int getOtp() {
        return otp;
    }

    public String getAptStatus() {
        return aptStatus;
    }

    public PatientPojo() {
    }

    public PatientPojo(String firstName, String lastName, int age, String patientId, String gender, String marriedStatus, String address, String city, String mno, Date date, String opd, String doctorId, int otp, String aptStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.patientId = patientId;
        this.gender = gender;
        this.marriedStatus = marriedStatus;
        this.address = address;
        this.city = city;
        this.mno = mno;
        this.date = date;
        this.opd = opd;
        this.doctorId = doctorId;
        this.otp = otp;
        this.aptStatus = aptStatus;
    }
    private String firstName;
    private String lastName;
    private int age;
    private String patientId;
    private String gender;
    private String marriedStatus;
    private String address;
    private String city;
    private String mno;
    private Date date;
    private String opd;
    private String doctorId;
    private int otp;
    private String aptStatus;
    
}
