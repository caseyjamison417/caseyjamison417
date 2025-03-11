package org.example;

import org.example.model.NEOFeedResponse;
import org.example.model.Neo;
import org.example.service.NEOService;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to my Near Earth Object App!");

        LocalDate date = LocalDate.now();
        //System.out.println(date);

        NEOService service = new NEOService();
        NEOFeedResponse response = service.getNEOData(String.valueOf(date));

        //for each loop --looping thru the keys

        for (String key: response.getNearEarthObjects().keySet()){
            //grab list that is the value from the key
            List<Neo> neoList = response.getNearEarthObjects().get(key);
            int count = neoList.size();

            System.out.println("For Date: " + key +
                    " there are" + count +
                    " near earth objects");
            //for each neo

            String code = "\u001B[0m";

            for (Neo n : neoList){
                //if potentially hazardous -- change text color to red
                if(n.isPotentiallyHazardousAsteroid()){
                    code = "\u001B[31m";
                }
                System.out.println(code + "Id:" + n.getId());
                System.out.println("\tName: " + n.getName());
                System.out.println("\tPotentially hazardous? " + n.isPotentiallyHazardousAsteroid());
                System.out.println("\tEstimated Diameter: ");
                System.out.println("\tMin (in miles)" + n.getEstimatedDiameter().getMiles().getEstimatedDiameterMin());
                System.out.println("\tMax (in miles)" + n.getEstimatedDiameter().getMiles().getEstimatedDiameterMax());

                if(n.isPotentiallyHazardousAsteroid()){ //reset to white
                    code = "\u001B[0m";
                }
            }
        }

    }
}