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
public class HospitalCity {
    private String CityName;
    
    private List<Hospital> Hospitals;

    public HospitalCity(String CityName, List<Hospital> Hospitals) {
        this.CityName = CityName;
        this.Hospitals=Hospitals;
    }
     public HospitalCity(String CityName) {
        this.CityName=CityName;
        this.Hospitals= new ArrayList<Hospital>();
    }
     public void addHospital(Hospital hospital){
        this.Hospitals.add(hospital);
    }
    
    public void addCommunities(ArrayList<Hospital> hospitals){
        this.Hospitals.addAll(hospitals);
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public List<Hospital> getHospitals() {
        return Hospitals;
    }

    public void setHospitals(List<Hospital> Hospitals) {
        this.Hospitals = Hospitals;
    }

    
    
    
    
    

}