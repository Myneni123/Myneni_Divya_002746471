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
public class Patient {
    private EncounterHistory encounterhistory;

    public Patient(EncounterHistory encounterhistory) {
        this.encounterhistory = encounterhistory;
    }
    
    public Patient(){
        this.encounterhistory = new EncounterHistory();
    }    

    public EncounterHistory getEncounterhistory() {
        return encounterhistory;
    }

    public void setEncounterhistory(EncounterHistory encounterhistory) {
        this.encounterhistory = encounterhistory;
    }

    

    
}
