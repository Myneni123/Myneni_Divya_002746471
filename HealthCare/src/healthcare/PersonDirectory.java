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
public class PersonDirectory {
     private List<Person> persons;

    public PersonDirectory(List<Person> persons) {
        this.persons=persons;
    
}

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
