/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author mynenidivya
 */
public class House {
    private String HouseName;
    
    private String State;
    
    private String Country;
    
    private List<Person> persons;

    public House(String HouseName, String State, String Country) {
        this.HouseName = HouseName;
        this.State = State;
        this.Country = Country;
        this.persons = new ArrayList<Person>();
    }
    
    

    public House(String HouseName, String State, String Country, List<Person> persons) {
        this.HouseName=HouseName;
        this.State = State;
        this.Country = Country;
        this.persons=persons;
    }


    public String getHouseName() {
        return HouseName;
    }

    public void setHouseName(String HouseName) {
        this.HouseName = HouseName;
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

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
    @Override
    public String toString(){
    return HouseName;
}
}
