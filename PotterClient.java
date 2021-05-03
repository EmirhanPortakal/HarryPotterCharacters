/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emirhan.harrypotter;

import com.google.gson.Gson;

/**
 *
 * @author emirh
 */
public class PotterClient {
    // sitenin adresi
    String baseURLcharacter = "https://www.potterapi.com/v1/characters/";
    // bana ait olan key
    String apiKey = "?key=$2a$10$xFHDqBel47qTNZYhMYWULOa5qrUesaxY824V01fpY0fZlbkfnyKQu";
    
    
    
    public class potterCharacters{
      //karakterlerdeki öğeler(nested class olarak)
        String name;
        String house;
        String bloodStatus;
        String species;
        String role; 
    
    }
    //öğeleri alabilmem için getCharacter metodu.
    public potterCharacters getCharacter(String id){
        String url = baseURLcharacter + id + apiKey;
        forGson fg = new forGson();
        String json = fg.getAsJson(url);
        Gson gson = new Gson();
        potterCharacters pc = gson.fromJson(json, potterCharacters.class);
        return pc;
    }
    
    
}
