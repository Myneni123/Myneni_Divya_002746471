/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.util.List;
import java.util.Date;

/**
 *
 * @author mynenidivya
 */
public class Community {
    private String CommunityName;
    
    private long Population;
    
    private List<House> Houses;

    public Community(String CommunityName, long Population, List<House> Houses) {
        this.CommunityName = CommunityName;
        this.Population = Population;
        this.Houses=Houses;
                }

    public String getCommunityName() {
        return CommunityName;
    }

    public void setCommunityName(String CommunityName) {
        this.CommunityName = CommunityName;
    }

    public long getPopulation() {
        return Population;
    }

    public void setPopulation(long Population) {
        this.Population = Population;
    }

    public List<House> getHouses() {
        return Houses;
    }

    public void setHouses(List<House> Houses) {
        this.Houses = Houses;
    }
  @Override
public String toString(){
    return CommunityName;
}  
    
}

