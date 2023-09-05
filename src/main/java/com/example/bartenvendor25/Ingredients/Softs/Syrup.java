package com.example.bartenvendor25.Ingredients.Softs;

import com.example.bartenvendor25.Ingredients.Soft;

import java.util.Vector;

public class Syrup extends Soft {
    private String subType;
    public Syrup(String name, String description, Soft.typeOfSoft typeOfSoft, String subType) {
        super(name, description, typeOfSoft);
        this.subType = subType;
    }

    private Vector<String> initialTypeOfSubType = new Vector<>();

    @Override
    public String getSubType() {
        return subType;
    }
}
