/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mynenidivya
 */
public class VitalSigns {
    private double Weight;
    private double Height;
    private double Systolic;
    private double Diastolic;
    private double Temperature;
    private int PulseRate;
    private int RespirationRate;
    private String Created;
    private String Updated;
    public VitalSigns(double Height, int PulseRate, int RespirationRate, double Systolic, double Diastolic, int par5, int par6, double Temperature)
    {
        this.Weight=Weight;
        this.Height=Height;
        this.Temperature=Temperature;
        this.RespirationRate=RespirationRate;
        this.Diastolic=Diastolic;
        this.Systolic=Systolic;
        this.PulseRate=PulseRate;
        this.Created=formateDate(new Date());
        this.Updated=formateDate(new Date());
        
         }
   public VitalSigns(){
        
    }

    private String formateDate(Date date) {
       String Formate="yyyy-mm-dd hh:mm:ss";
       
       SimpleDateFormat Simple=new SimpleDateFormat(Formate);
       return Simple.format(date);
    }
     
     public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public double getSystolic() {
        return Systolic;
    }

    public void setSystolic(double Systolic) {
        this.Systolic = Systolic;
    }

    public double getDiastolic() {
        return Diastolic;
    }

    public void setDiastolic(double Diastolic) {
        this.Diastolic = Diastolic;
    }

    public double getTemperature() {
        return Temperature;
    }

    public void setTemperature(double Temperature) {
        this.Temperature = Temperature;
    }

    public int getPulseRate() {
        return PulseRate;
    }

    public void setPulseRate(int PulseRate) {
        this.PulseRate = PulseRate;
    }

    public int getRespirationRate() {
        return RespirationRate;
    }

    public void setRespirationRate(int RespirationRate) {
        this.RespirationRate = RespirationRate;
    }

    public String getCreated() {
        return Created;
    }

    public void setCreated(String Created) {
        this.Created = Created;
    }

    public String getUpdated() {
        return Updated;
    }

    public void setUpdated(String Updated) {
        this.Updated = Updated;
    }
    @Override
    public String toString()
    {
        return String.valueOf(Weight);
    }
       
              
    
    
    
}
