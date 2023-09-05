package com.example.bartenvendor20.Ingredients;

public abstract class Soft extends Ingredient {
    private final typeOfSoft typeOfSoft;
    public Soft(String name, String description, typeOfSoft typeOfSoft) {
        super(name, description, typeOfIngredient.SOFT);
        this.typeOfSoft = typeOfSoft;
    }

    public Soft.typeOfSoft getTypeOfSoft() {
        return typeOfSoft;
    }

    public abstract String getSubType();

    public enum typeOfSoft{
        JUICE,
        OTHER,
        SOFTDRINK,
        SYRUP
    }
}
