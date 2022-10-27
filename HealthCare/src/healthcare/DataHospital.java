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
public class DataHospital {
    public static System1 initializeSystem(){
        Doctor d1 = new Doctor("JimHope","MD(Orthopedics)");
        Doctor d2 = new Doctor("Joseph","MD(GeneralMedicine)");
        Doctor d3 = new Doctor("Peter","MBBS(Surgeon)");
        Doctor d4 = new Doctor("Lisa","DM(Cardio)");
        
        
        List<Doctor> docs= new ArrayList<>();
        docs.add(d1);
        docs.add(d2);
        docs.add(d3);
        docs.add(d4);
       Hospital h1= new Hospital("Boston Hospital", "MA", "USA", docs);
        List<Hospital> jhos = new ArrayList<>();
        jhos.add(h1);
        
        
        
        
        HospitalCity bostonCity = HospitalCities.getCitiesList().get(0);
        bostonCity.addHospital(h1);
         
        List<HospitalCity> cities = new ArrayList<>();
        cities.add(bostonCity);
        
        
         List<Doctor> DoctorsList = new ArrayList<>();
        DoctorsList.add(d1);
       DoctorsList.add(d2);
       DoctorsList.add(d3);
       DoctorsList.add(d4);
       DoctorDirectory doctorDirectory = new DoctorDirectory(DoctorsList);
        
        List<Hospital> hList = new ArrayList<>();
        hList.add(h1);
       
        HospitalDirectory hospitalDirectory = new HospitalDirectory(hList);
       
        System1 system = new System1(cities, hospitalDirectory, doctorDirectory);
        
        return system;
        
        
        
    }
    
}
