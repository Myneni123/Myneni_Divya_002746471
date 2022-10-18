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
public class Encounter {
    private VitalSigns vitalSigns;

    public Encounter(VitalSigns vitalSigns) {
        this.vitalSigns=vitalSigns;
    }
    
    public Encounter() {
        this.vitalSigns = new VitalSigns();
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
}
