/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.pojo;

/**
 *
 * @author Ramkumar
 */
public class AppointmentPojo {

    public AppointmentPojo() {
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setOpd(String opd) {
        this.opd = opd;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getOpd() {
        return opd;
    }

    public String getStatus() {
        return status;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public AppointmentPojo(String patientId, String patientName, String opd, String status, String appointmentDate, String doctorName, String mobileNo) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.opd = opd;
        this.status = status;
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
        this.mobileNo = mobileNo;
    }
    private String patientId;
    private String patientName;
    private String opd;
    private String status;
    private String appointmentDate;
    private String doctorName;
    private String mobileNo;
}
