package com.example.bartenvendor20.Ingredients.Softs;

import com.example.bartenvendor20.Ingredients.Soft;

public class Other extends Soft {
    public Other(String name, String description, Soft.typeOfSoft typeOfSoft) {
        super(name, description, typeOfSoft);
    }

    @Override
    public String getSubType() {
        return null;
    }
}
