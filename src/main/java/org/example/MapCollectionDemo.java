package org.example;

import java.util.*;

public class MapCollectionDemo {

    public void MapDemo() {
        Map<String, List<String>> mapStateCity = new HashMap<>();

        List<String> lstCity = new ArrayList<>();
        lstCity.add("Mumbai");
        lstCity.add("Nashik");
        lstCity.add("Pune");
        lstCity.add("Nagpur");

        mapStateCity.put("Maharashtra", lstCity);
        mapStateCity.put("Karnataka", Arrays.asList("Bengaluru","Tumkur","Mangalore","Coorg"));
        mapStateCity.put("Rajasthan", Arrays.asList("Jaipur","Udaipur","Ajmer","Jodhpur"));

        // Input from user for the state
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of state or city: ");
        String place = scanner.nextLine();

        //Check if city exists
        List<String> cities = mapStateCity.get(place);

        //Display message based on the result
        if(cities != null) {
            System.out.println("Cities in " + place + ":");
            for (String city : cities) {
                System.out.println(city);
            }
        }
        else {
            System.out.println("No state with name " + place + " found. Let's search the cities");
            Boolean CityFound = true;
            for (Map.Entry<String, List<String>> entry : mapStateCity.entrySet()) {
                String state = entry.getKey();
                cities = entry.getValue();

                if (cities.contains(place)) {
                    System.out.println(place + " is located in " + state + ".");
                    CityFound = true;
                    break;
                }
                else {
                    CityFound = false;
                }
            }
            if (CityFound == false) {
                System.out.println(place + " Not found ");
            }
        }
    }
}
