package com.example.bartenvendor25.Ingredients.Alcohols;

import com.example.bartenvendor25.Ingredients.Alcohol;

public class Wine extends Alcohol {
    private final String subType;
    public Wine(String name, String description, Alcohol.typeOfAlcohol typeOfAlcohol, String subType) {
        super(name, description, typeOfAlcohol);
        this.subType = subType;
    }

    public String getSubType(){
        return subType;
    }

}