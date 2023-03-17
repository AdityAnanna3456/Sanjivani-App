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
public class ReceptionistPojo {

    public void setReceptionistId(String receptionistId) {
        this.receptionistId = receptionistId;
    }

    public void setReceptionistName(String receptionistName) {
        this.receptionistName = receptionistName;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getReceptionistId() {
        return receptionistId;
    }

    public String getReceptionistName() {
        return receptionistName;
    }

    public String getGender() {
        return Gender;
    }

    public ReceptionistPojo() {
    }
    private String receptionistId;
    private String receptionistName;
    private String Gender;
    
}
