/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.util.List;
import java.util.Date;
/**
 *
 * @author mynenidivya
 */
public class DoctorDirectory {
    private List<Doctor> Doctors;

    public DoctorDirectory(List<Doctor> Doctors) {
        this.Doctors = Doctors;
    }

    public List<Doctor> getDoctors() {
        return Doctors;
    }

    public void setDoctors(List<Doctor> Doctors) {
        this.Doctors = Doctors;
    }
    
    
}
