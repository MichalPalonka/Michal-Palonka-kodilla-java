package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class CheckProducent {
    public ProducentInterface checker (String order){
        Map products = new HashMap<String, String>();
        products.put("bread HS", "HS");
        products.put("milk HS", "HS");
        products.put("onions HS", "HS");

        products.put("bread GFS", "GFS");
        products.put("milk GFS", "GFS");
        products.put("onions GFS", "GFS");

        products.put("bread EFS", "EFS");
        products.put("milk EFS", "EFS");
        products.put("onions EFS", "EFS");

        String producent = products.get(order).toString();
        ProducentInterface producentInterface = null;

        if(producent == "HS"){
            producentInterface = new ExtraFoodShop();
        }else if(producent == "GFS"){
            producentInterface = new ExtraFoodShop();
        }else if(producent == "EFS"){
            producentInterface = new ExtraFoodShop();
        }else{
            System.out.println("Error");
        }
        return producentInterface;
    }
}
