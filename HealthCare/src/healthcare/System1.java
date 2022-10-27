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
public class System1 {
    private List<HospitalCity> Cities = new ArrayList<HospitalCity>();
    
    private HospitalDirectory HospitalDirectory;
    
    private DoctorDirectory DoctorDirectory;

    public System1(List<HospitalCity> Cities, HospitalDirectory HospitalDirectory, DoctorDirectory DoctorDirectory) {
        this.Cities= Cities;
        this.HospitalDirectory = HospitalDirectory;
        this.DoctorDirectory = DoctorDirectory;
    }

    public List<HospitalCity> getCities() {
        return Cities;
    }

    public void setCities(List<HospitalCity> Cities) {
        this.Cities = Cities;
    }

    public HospitalDirectory getHospitalDirectory() {
        return HospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory HospitalDirectory) {
        this.HospitalDirectory = HospitalDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return DoctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory DoctorDirectory) {
        this.DoctorDirectory = DoctorDirectory;
    }

    
}
