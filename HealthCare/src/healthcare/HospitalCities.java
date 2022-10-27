/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.util.ArrayList;

/**
 *
 * @author mynenidivya
 */
public class HospitalCities {
    private static ArrayList<HospitalCity> CitiesList  = new ArrayList<HospitalCity>(){
        {
            add(new HospitalCity("Boston", new ArrayList<Hospital>()));
           add(new HospitalCity("Dallas", new ArrayList<Hospital>())); 
        }
    };

    public static ArrayList<HospitalCity> getCitiesList() {
        return CitiesList;
    }

    public static void setCitiesList(ArrayList<HospitalCity> CitiesList) {
        HospitalCities.CitiesList = CitiesList;
    }
     public static void addCity(City CityName){
        CityList.getCitiesList().add(CityName);
    }
    

    
}
