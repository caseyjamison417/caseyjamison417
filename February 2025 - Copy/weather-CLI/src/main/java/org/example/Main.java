package org.example;

import org.example.Models.LatLon;
import org.example.Models.Weather;
import org.example.Models.WeatherObject;
import org.example.Services.WeatherService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WeatherService service = new WeatherService();
        System.out.println("Welcome to my Weather App!");

        System.out.print("Enter your zipcode: ");
        String zip = input.nextLine();

        LatLon response = service.getLatLon(zip);


        WeatherObject weatherResponse = service.getWeather(response);

        System.out.println("Current weather in " + response.getName());
        System.out.println("Current temp: " +weatherResponse.getMain().getTemp());
        System.out.println("Feels like: " + weatherResponse.getMain().getFeelsLike());
        System.out.println("Humidity: " + weatherResponse.getMain().getHumidity());

        Weather[] weatherArr = weatherResponse.getWeather();
        System.out.println("Today's weather: " + weatherArr[0].getDescription());


    }
}