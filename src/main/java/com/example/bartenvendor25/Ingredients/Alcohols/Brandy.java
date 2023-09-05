package com.example.bartenvendor20.Ingredients.Alcohols;

import com.example.bartenvendor20.Ingredients.Alcohol;

import java.util.Vector;

public class Brandy extends Alcohol {
    private String subType;
    public Brandy(String name, String description, Alcohol.typeOfAlcohol typeOfAlcohol, String subType) {
        super(name, description, typeOfAlcohol);
        this.subType = subType;
    }

    @Override
    public String getSubType() {
        return subType;
    }
}
