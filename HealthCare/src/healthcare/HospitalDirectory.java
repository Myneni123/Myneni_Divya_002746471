/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.util.List;

/**
 *
 * @author mynenidivya
 */
public class HospitalDirectory {
    private List<Hospital> Hospitals;

    public HospitalDirectory(List<Hospital> Hospitals) {
        this.Hospitals=Hospitals;
    }

    public List<Hospital> getHospitals() {
        return Hospitals;
    }

    public void setHospitals(List<Hospital> Hospitals) {
        this.Hospitals = Hospitals;
    }
    
}
