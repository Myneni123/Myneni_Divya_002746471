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
public class Person {
    private String  Name;
    
    private double Age;
    
    private String Gender;
    
    private boolean Married;
    
    private Patient Patient;
public Person(String Name, double Age, String Gender, boolean Married, Patient Patient){
    this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
        this.Married = Married;
        this.Patient = Patient;
}

    public boolean isMarried() {
        return Married;
    }

    public void setMarried(boolean Married) {
        this.Married = Married;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getAge() {
        return Age;
    }

    public void setAge(double Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Patient getPatient() {
        return Patient;
    }

    public void setPatient(Patient Patient) {
        this.Patient = Patient;
    }
    @Override
    public String toString(){
            return Name;
    }

}
