/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;
import java.util.Date;
import java.util.List;


/**
 *
 * @author mynenidivya
 */
public class PatientDirectory {
    private List<Patient> Patients;

    public PatientDirectory(List<Patient> Patients) {
        this.Patients=Patients;
        
    }

    public List<Patient> getPatients() {
        return Patients;
    }

    public void setPatients(List<Patient> Patients) {
        this.Patients = Patients;
    }
    
}
