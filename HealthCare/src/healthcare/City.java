/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mynenidivya
 */
public class City {
    
    private String CityName;
    
    private List<Community> Communities;

    public City(String CityName, List<Community> CommunityList) {
        this.CityName=CityName;
        this.Communities=CommunityList;
    }
    
    public City(String CityName) {
        this.CityName=CityName;
        this.Communities= new ArrayList<Community>();
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public List<Community> getCommunities() {
        return Communities;
    }

    public void setCommunities(List<Community> Communities) {
        this.Communities = Communities;
    }
    
}
