package com.example.bartenvendor20.Ingredients.Softs;

import com.example.bartenvendor20.Ingredients.Soft;

import java.util.Vector;

public class Juice extends Soft {
    private String subType;
    public Juice(String name, String description, String subType) {
        super(name, description, typeOfSoft.JUICE);
        this.subType = subType;
    }

    @Override
    public String getSubType() {
        return subType;
    }
}
