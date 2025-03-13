package com.techelevator.dao;

import com.techelevator.model.LatLon;
import com.techelevator.model.User;
import com.techelevator.model.WeatherDto;
import com.techelevator.model.WeatherObject;

import java.util.List;

public interface WeatherDao {

    //crud
    void saveWeather(WeatherObject Weather, User user, LatLon latlon);


    List<WeatherDto> getWeatherByUserId(int userid);


}
