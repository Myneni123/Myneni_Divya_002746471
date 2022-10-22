/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mynenidivya
 */
public class EncounterHistory {
    private List<Encounter> encounters;

    public EncounterHistory(List<Encounter> encounters) {
        this.encounters = encounters;
    }
    
    public EncounterHistory() {
        this.encounters = new ArrayList<Encounter>();
    }

    public List<Encounter> getEncounters() {
        return encounters;
    }

    public void setEncounters(List<Encounter> Encounters) {
        this.encounters = Encounters;
    }
    
}
