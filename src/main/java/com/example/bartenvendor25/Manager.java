package com.example.bartenvendor25;

import com.example.bartenvendor25.Ingredients.Ingredient;

import java.io.*;
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

    public void writeToFile() throws IOException {
        //write recipes to file
        FileOutputStream fos = null;
        ObjectOutputStream oos =null;
        try{
            fos = new FileOutputStream("recipes.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(recipes);
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        finally {
            if(oos != null){
                try{
                    oos.close();
                }
                catch(IOException ioe1){
                    ioe1.printStackTrace();
                }
            }
            if(fos!=null){
                try{
                    fos.close();
                }
                catch(IOException ioe2){
                    ioe2.printStackTrace();
                }
            }
        }
        //write stock to file
        FileOutputStream fos2 = null;
        ObjectOutputStream oos2 =null;
        try{
            fos2 = new FileOutputStream("stock.txt");
            oos2 = new ObjectOutputStream(fos2);
            oos2.writeObject(stock);
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        finally {
            if(oos2 != null){
                try{
                    oos2.close();
                }
                catch(IOException ioe1){
                    ioe1.printStackTrace();
                }
            }
            if(fos2!=null){
                try{
                    fos2.close();
                }
                catch(IOException ioe2){
                    ioe2.printStackTrace();
                }
            }
        }
    }

    public void readFromFile() throws IOException, ClassNotFoundException{
        Vector<Recipe> vRec;
        FileInputStream fis = null;
        ObjectInputStream ois= null;
        try{
            fis = new FileInputStream("recipes.txt");
            ois = new ObjectInputStream(fis);
            vRec = (Vector<Recipe>) ois.readObject();
            setRecipes(vRec);
        }
        catch(IOException ioe){
            ioe.printStackTrace();
            return;
        }
        catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
            return;
        }
        finally {
            if(ois != null){
                try{
                    ois.close();
                }
                catch(IOException ioe1){
                    ioe1.printStackTrace();
                }
            }
            if(fis != null){
                try{
                    fis.close();
                }
                catch(IOException ioe1){
                    ioe1.printStackTrace();
                }
            }
        }
        //deserialize stock
        HashMap<Ingredient,float> hStk = new HashMap<Ingredient, float>();
        FileInputStream fis2 = null;
        ObjectInputStream ois2= null;
        try{
            fis2 = new FileInputStream("stock.txt");
            ois2 = new ObjectInputStream(fis2);
            hStk = (HashMap<Ingredient, float>) ois2.readObject();
            setStock(hStk);
        }
        catch(IOException ioe){
            ioe.printStackTrace();
            return;
        }
        catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
            return;
        }
        finally {
            if(ois2 != null){
                try{
                    ois2.close();
                }
                catch(IOException ioe1){
                    ioe1.printStackTrace();
                }
            }
            if(fis2 != null){
                try{
                    fis2.close();
                }
                catch(IOException ioe1){
                    ioe1.printStackTrace();
                }
            }
        }
    }
}
