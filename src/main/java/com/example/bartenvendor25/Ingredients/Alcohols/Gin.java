package com.example.bartenvendor25.Ingredients.Alcohols;

import com.example.bartenvendor25.Ingredients.Alcohol;

import java.util.Vector;

public class Gin extends Alcohol {
    private String subType;
    public Gin(String name, String description, Alcohol.typeOfAlcohol typeOfAlcohol,String subType) {
        super(name, description, typeOfAlcohol);
        this.subType = subType;
    }

    @Override
    public String getSubType() {
        return subType;
    }
}
