package com.techelevator.dao;

import com.techelevator.model.Neo;
import org.springframework.cglib.core.Local;

public interface NeoDao {

    //save to the db

    Neo saveNeo(Neo neo, int userId, Local date);

    Neo getNeoById(int id);
}
