package com.example.bartenvendor25.Ingredients.Alcohols;

import com.example.bartenvendor25.Ingredients.Alcohol;

public class Tequila extends Alcohol {
    private final String subType;
    public Tequila(String name, String description, Alcohol.typeOfAlcohol typeOfAlcohol, String subType) {
        super(name, description, typeOfAlcohol);
        this.subType = subType;
    }

    public String getSubType(){
        return subType;
    }

}