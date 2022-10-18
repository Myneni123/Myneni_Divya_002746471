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
    private List<Encounter> Encounters;

    public EncounterHistory(List<Encounter> encounters) {
        this.Encounters = Encounters;
    }
    
    public EncounterHistory() {
        this.Encounters = new ArrayList<Encounter>();
    }

    public List<Encounter> getEncounters() {
        return Encounters;
    }

    public void setEncounters(List<Encounter> Encounters) {
        this.Encounters = Encounters;
    }
    
}
