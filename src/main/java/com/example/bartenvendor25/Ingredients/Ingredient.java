package com.example.bartenvendor25.Ingredients;

import java.io.Serializable;

public abstract class Ingredient implements Serializable {
    private String name;
    private String description;
    private typeOfIngredient typeOfIngredient;

    public Ingredient(String name, String description, Ingredient.typeOfIngredient typeOfIngredient) {
        this.name = name;
        this.description = description;
        this.typeOfIngredient = typeOfIngredient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Ingredient.typeOfIngredient getTypeOfIngredient() {
        return typeOfIngredient;
    }

    public void setTypeOfIngredient(Ingredient.typeOfIngredient typeOfIngredient) {
        this.typeOfIngredient = typeOfIngredient;
    }

    public abstract String getSubType();

    public static enum typeOfIngredient{
        ALCOHOL,
        SOFT,
        OTHER
    };
}
