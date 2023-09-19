package com.example.bartenvendor25;
import com.example.bartenvendor25.Ingredients.Ingredient;

import java.io.Serializable;
import java.util.HashMap;

public class Recipe implements Serializable {
    public Recipe(String name, method mtType, String description, ice iType){
        this.name = name;
        this.methodType = mtType;
        this.description = description;
        this.iceType = iType;
        this.ingredients = new HashMap<>();
    }
    private static class amountUniqeness{
        public float amount;
        public boolean Uniqeness;
        public amountUniqeness(float amount, boolean Uniqeness){
            this.amount = amount;
            this.Uniqeness = Uniqeness;
        }
    }
    private String name;
    private method methodType;
    private String description;
    private ice iceType;
    private HashMap<Ingredient,amountUniqeness> ingredients;
    public enum method{
        SHAKE,
        DRY_SHAKE,
        STIR,
        OTHER
    }
    public enum ice{
        CUBES,
        ROCKS,
        NEAT
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public method getMethodType() {
        return methodType;
    }

    public void setMethodType(method methodType) {
        this.methodType = methodType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ice getIceType() {
        return iceType;
    }

    public void setIceType(ice iceType) {
        this.iceType = iceType;
    }

    public HashMap<Ingredient, amountUniqeness> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashMap<Ingredient, amountUniqeness> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingr, float amount, boolean uniq){
        ingredients.put(ingr,new amountUniqeness(amount,uniq));
    }

    public void removeIngredient(Ingredient ingr){
        ingredients.remove(ingr);
    }
}
