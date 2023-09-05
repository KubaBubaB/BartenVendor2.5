package com.example.bartenvendor20.Ingredients.Softs;

import com.example.bartenvendor20.Ingredients.Soft;

import java.util.Vector;

public class SoftDrink extends Soft {
    private String subType;
    public SoftDrink(String name, String description, Soft.typeOfSoft typeOfSoft, String subType) {
        super(name, description, typeOfSoft);
        this.subType = subType;
    }

    @Override
    public String getSubType() {
        return subType;
    }
}
