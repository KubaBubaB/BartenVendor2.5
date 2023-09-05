package com.example.bartenvendor25.Ingredients;

import java.util.Vector;

public abstract class Alcohol extends Ingredient {
    private final typeOfAlcohol typeOfAlcohol;
    public Alcohol(String name, String description, typeOfAlcohol typeOfAlcohol) {
        super(name, description, typeOfIngredient.ALCOHOL);
        this.typeOfAlcohol = typeOfAlcohol;
    }

    public Alcohol.typeOfAlcohol getTypeOfAlcohol() {
        return typeOfAlcohol;
    }
    public abstract String getSubType();
    public enum typeOfAlcohol{
        BEER,
        BRANDY,
        CIDER,
        GIN,
        LIQUEUR,
        OTHER,
        RUM,
        TEQUILA,
        VERMOUTH,
        VODKA,
        WHISKEY,
        WINE
    };
}
