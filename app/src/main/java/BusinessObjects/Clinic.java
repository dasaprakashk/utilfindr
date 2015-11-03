package BusinessObjects;

import android.provider.ContactsContract;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Das on 03/11/15.
 */
public class Clinic {

    private String id;
    private String name;
    private String doctorName;
    private String education;
    private DoctorSpeciality speciality;
    private Timestamp startTime;
    private Timestamp endTime;
    private List<Integer> offDays;
    private int phoneNumber;
    private int mobileNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public DoctorSpeciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(DoctorSpeciality speciality) {
        this.speciality = speciality;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Integer> getOffDays() {
        return offDays;
    }

    public void setOffDays(List<Integer> offDays) {
        this.offDays = offDays;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }
}
