/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mynenidivya
 */
public class Hospital {
    private String HospitalName;
    
    private String State;
    
    private String Country;
    
    private List<Doctor> Doctors;

    public Hospital(String HospitalName, String State, String Country, List<Doctor> Doctors) {
        this.HospitalName = HospitalName;
        this.State = State;
        this.Country = Country;
        this.Doctors = Doctors;
    }
    public Hospital(String HospitalName, String State, String Country) {
        this.HospitalName = HospitalName;
        this.State = State;
        this.Country = Country;
        this.Doctors = new ArrayList<Doctor>();
    }
    
     public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public List<Doctor> getDoctors() {
        return Doctors;
    }

    public void setDoctors(List<Doctor> Doctors) {
        this.Doctors = Doctors;
    }
     @Override
    public String toString(){
    return HospitalName;
}
    
    
    
}
    
