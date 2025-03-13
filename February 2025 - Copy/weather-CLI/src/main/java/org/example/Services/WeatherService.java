package org.example.Services;

import org.example.Models.LatLon;
import org.example.Models.WeatherObject;
import org.springframework.web.client.RestTemplate;

public class WeatherService {

    private RestTemplate template = new RestTemplate();


    private final String API_URL = "http://api.openweathermap.org";

    private final String API_KEY = "44593b439c95ab65681e19ff109c0268";

    public LatLon getLatLon(String zipcode){
        String url = API_URL + "/geo/1.0/zip?zip=" + zipcode +
                "&appid=" + API_KEY;
        LatLon response = template.getForObject(url, LatLon.class);

        return response;
    }

    public WeatherObject getWeather(LatLon latlon){
        String url = "https://api.openweathermap.org" +
                "/data/2.5/weather?lat=" + latlon.getLat() +
                "&lon=" + latlon.getLon() +
                "appid=" + API_KEY;
        WeatherObject response =
                template.getForObject(url, WeatherObject.class);
        return response;

    }
}
