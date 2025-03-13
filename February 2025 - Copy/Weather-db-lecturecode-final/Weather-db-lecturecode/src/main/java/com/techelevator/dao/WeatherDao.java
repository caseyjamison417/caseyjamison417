package com.techelevator.dao;

import com.techelevator.model.LatLon;
import com.techelevator.model.User;
import com.techelevator.model.WeatherDto;
import com.techelevator.model.WeatherObject;

import java.util.List;

public interface WeatherDao {

    // CRUD
    void saveWeather(WeatherObject weather, User user, LatLon latLon);


    List<WeatherDto> getWeatherByUserId(int userId);

}
