package com.goblintech.boundry;


import java.util.ArrayList;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.goblintech.data.NumberProducer;


/**
 * CreationService
 */
@ApplicationPath("/api")
public class CreationService extends Application {

    @Inject
    NumberProducer numberProducer;

    public ArrayList<Integer> getPrimeNumbers(){
        return numberProducer.findPrimeNumbers();
    }
}