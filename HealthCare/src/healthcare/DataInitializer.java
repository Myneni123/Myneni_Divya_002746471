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
public class DataInitializer {
    public static System initializeSystem(){
        
        
        //Boston
        //Person1
        //VitalSigns(weight,bloodPressure,height,bodyTemperaturee,pulseRate,respirationRate)
        VitalSigns p1vs1 = new VitalSigns(60.20, 120, 80, 5.11, 38.8, 90, 19);
        VitalSigns p1vs2 = new VitalSigns(63.45, 135, 99, 6.00, 37.7, 90, 18);
        VitalSigns p1vs3 = new VitalSigns(58.21, 98, 89, 6.00, 39.5, 90, 18);

        Encounter p1Enc1 = new Encounter(p1vs1);
        Encounter p1Enc2 = new Encounter(p1vs2);
        Encounter p1Enc3 = new Encounter(p1vs3);

        List<Encounter> p1encounterslist = new ArrayList<Encounter>();
        p1encounterslist.add(p1Enc1);
        p1encounterslist.add(p1Enc2);
        p1encounterslist.add(p1Enc3);
        EncounterHistory p1encounterhistory = new EncounterHistory(p1encounterslist);
        
        Patient p1 = new Patient(p1encounterhistory);
        Person person1 = new Person("Rahul",23.5,"Male",true,p1);
        
        //Person2
        VitalSigns p2vs1 = new VitalSigns(65.00, 118, 80, 5.70, 39.8, 94, 19);
        VitalSigns p2vs2 = new VitalSigns(64.60, 85, 95, 5.70, 40.5, 93, 20);
        VitalSigns p2vs3 = new VitalSigns(66.8, 142, 94, 5.70, 38.3, 96, 18);
        
        Encounter p2Enc1 = new Encounter(p2vs1);
        Encounter p2Enc2 = new Encounter(p2vs2);
        Encounter p2Enc3 = new Encounter(p2vs3);

        List<Encounter> p2encounterslist = new ArrayList<Encounter>();
        p2encounterslist.add(p2Enc1);
        p2encounterslist.add(p2Enc2);
        p2encounterslist.add(p2Enc3);
        EncounterHistory p2encounterhistory = new EncounterHistory(p2encounterslist);
       
        Patient p2 = new Patient(p2encounterhistory);
        Person person2 = new Person("Lisa",26.0,"Female",false,p2);
        
        List<Person> house1Persons = new ArrayList<>();
        house1Persons.add(person1);
        house1Persons.add(person2);
        
        House jPHouse1 = new House("Alphonsus Street", "Massachusetts", "USA", house1Persons);
        List<House> jphouses = new ArrayList<>();
        jphouses.add(jPHouse1);
        
        Community jpCommunity = new Community("Roxbury Avenue",100,jphouses);
        List<Community> jpCommunities = new ArrayList<>();
        jpCommunities.add(jpCommunity);
        
        
        //CityList citylist = new 
        City bostonCity = CityList.getCitiesList().get(0);
        bostonCity.addCommunity(jpCommunity);
        
//        City NewYork = CityList.getCitiesList().get(1);
        
//        City bostonCity = new City(CityList.getCitiesList().get(0).getCityName(), jpCommunities);
//        City bostonCity = new City(CityList.getCitiesList().get(0).getCityName(), jpCommunities);
//        City bostonCity = new City(CityList.getCitiesList().get(0).getCityName(), jpCommunities);
        
        //MissionHill
        //Person1
        VitalSigns vsMHPerson1visit1 = new VitalSigns(55.20, 138, 86, 5.10, 38.8, 95, 19);
        VitalSigns vsMHPerson1visit2 = new VitalSigns(56.45, 122, 87, 6.00, 37.7, 96, 19);
        VitalSigns vsMHPerson1visit3 = new VitalSigns(57.21,143, 89, 6.00, 39.5, 97, 19);

        //Person2
        VitalSigns vsMHPerson2visit1 = new VitalSigns(65.20, 111, 72, 5.70, 39.8, 94, 19);
        VitalSigns vsMHPerson2visit2 = new VitalSigns(64.60, 125, 95, 5.70, 40.5, 93, 20);

        //Roxubory
        //Person1
        VitalSigns vsRBPerson1visit1 = new VitalSigns(46.20, 128, 83, 5.10, 38.8, 95, 19);
        VitalSigns vsRBPerson1visit2 = new VitalSigns(48.45, 102, 89, 5.10, 38.7, 96, 19);
        
        //Person2
        VitalSigns vsRBPerson2visit1 = new VitalSigns(55.20, 136, 86, 5.10, 38.8, 95, 19);
        
        List<City> cities = new ArrayList<>();
        cities.add(bostonCity);
        
        
        List<Person> personsList = new ArrayList<>();
        personsList.add(person1);
        personsList.add(person2);
        PersonDirectory personDirectory = new PersonDirectory(personsList);
        
        List<Patient> patientsList = new ArrayList<>();
        patientsList.add(p1);
        patientsList.add(p2);
        PatientDirectory patientDirectory = new PatientDirectory(patientsList);
       System system = new System(cities, personDirectory, patientDirectory);
        
        return system;
    }
    
   
    
    
}
