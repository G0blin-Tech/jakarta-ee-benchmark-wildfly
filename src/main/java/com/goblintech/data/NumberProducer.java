package com.goblintech.data;

import java.util.ArrayList;

import javax.annotation.PostConstruct;


/**
 * NumberProducer
 */
public class NumberProducer {

    private static final int CAP = 2500;
    private static final int CAP_AMOUNT = 10000;
    
    private ArrayList<Integer> mockData;
    
    public ArrayList<Integer> createMockData(){
        
        mockData = new ArrayList<>();

        for(int i = 0; i < CAP; i++){
            mockData.add((int) ((Math.random() * (CAP_AMOUNT - 2)) + 2));
        }

        return mockData;
    }

    public ArrayList<Integer> findPrimeNumbers(){

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for(int number : mockData){
            
            if(isPrime(number)){
                primeNumbers.add(number);
            }
          
        }
        return primeNumbers;
    }

    public boolean isPrime(int number){
        for(int i = 2; i < number; i++){

            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    @PostConstruct
    void init(){
        mockData = createMockData();
    }
}