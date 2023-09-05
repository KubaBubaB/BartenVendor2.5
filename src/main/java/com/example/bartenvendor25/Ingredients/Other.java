package com.example.bartenvendor25.Ingredients;

public class Other extends Ingredient{
    public Other(String name, String description) {
        super(name, description, typeOfIngredient.OTHER);
    }

    @Override
    public String getSubType() {
        return null;
    }
}
