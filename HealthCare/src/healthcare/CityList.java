/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author mynenidivya
 */
public class CityList {
    private static ArrayList<City> CitiesList  = new ArrayList<City>(){
        {
            add(new City("Boston", new ArrayList<Community>()));
           add(new City("Dallas", new ArrayList<Community>())); 
        }
    };

    public static ArrayList<City> getCitiesList() {
        return CitiesList;
    }

    public static void setCitiesList(ArrayList<City> CitiesList) {
        CityList.CitiesList = CitiesList;
    }
     public static void addCity(City CityName){
        CityList.getCitiesList().add(CityName);
    }
    
    
    
}
