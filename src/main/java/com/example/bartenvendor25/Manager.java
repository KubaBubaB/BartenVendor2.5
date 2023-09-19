package com.example.bartenvendor25;

import com.example.bartenvendor25.Ingredients.Ingredient;

import java.util.HashMap;
import java.util.Vector;

public class Manager {
    public Manager(){
        this.recipes = new Vector<>();
        this.stock = new HashMap<Ingredient, float>();
    }
    private HashMap<Ingredient, float> stock;
    private Vector<Recipe> recipes;

    public void addRecipe(Recipe rec){
        recipes.add(rec);
    }

    public void removeRecipe(Recipe rec){
        recipes.remove(rec);
    }

    public void addItem(Ingredient ing, float amount){
        if(stock.containsKey(ing)){
            stock.put(ing,stock.get(ing)+amount);
        }
        else{
            stock.put(ing, amount);
        }
    }

    public void removeItem(Ingredient ing, float amount){
        if(stock.containsKey(ing)) {
            stock.put(ing, stock.get(ing) - amount);
            if (stock.get(ing) <= 0) {
                stock.remove(ing);
            }
        }
    }

    public Vector<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Vector<Recipe> recipes) {
        this.recipes = recipes;
    }

    public HashMap<Ingredient, float> getStock() {
        return stock;
    }

    public void setStock(HashMap<Ingredient, float> stock) {
        this.stock = stock;
    }
}
