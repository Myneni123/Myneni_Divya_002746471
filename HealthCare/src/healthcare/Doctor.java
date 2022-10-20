/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;
import java.util.Date;

/**
 *
 * @author mynenidivya
 */
public class Doctor {
   private String Name;
   private String Specialization;

    public Doctor(String Name, String Specialization) {
        this.Name = Name;
        this.Specialization = Specialization;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }
   @Override
    public String toString(){
            return Name;
    
}
}
