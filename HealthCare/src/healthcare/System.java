/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author mynenidivya
 */
public class System {
     private List<City> Cities = new ArrayList<City>();
    
    private PersonDirectory personDirectory;
    
    private PatientDirectory patientDirectory;

    public System(List<City> Cities, PersonDirectory personDirectory, PatientDirectory patientDirectory) {
        this.Cities= Cities;
        this.personDirectory=personDirectory;
        this.patientDirectory=patientDirectory;
    }
    public void addCity(City CityName)
    {
        this.Cities.add(CityName);
    }

    public List<City> getCities() {
        return Cities;
    }

    public void setCities(List<City> Cities) {
        this.Cities = Cities;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
}
