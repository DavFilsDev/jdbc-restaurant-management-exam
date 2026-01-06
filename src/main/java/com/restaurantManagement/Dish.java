package com.restaurantManagement;

import java.util.ArrayList;
import java.util.List;

public class Dish {
    private int id;
    private String name;
    private DishTypeEnum dishType;
    private List<Ingredient> ingredients;

    public Dish(int id, String name, DishTypeEnum dishType, List<Ingredient> ingredients) {
        this.id = id;
        this.name = name;
        this.dishType = dishType;
        this.ingredients = ingredients != null ? ingredients : new ArrayList<>();
    }

    public Dish(int id, String name, DishTypeEnum dishType) {
        this(id, name, dishType, new ArrayList<>());
    }

    public Dish() {
        this.ingredients = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DishTypeEnum getDishType() {
        return dishType;
    }

    public void setDishType(DishTypeEnum dishType) {
        this.dishType = dishType;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredient != null) {
            this.ingredients.add(ingredient);
        }
    }

    public boolean removeIngredient(Ingredient ingredient) {
        return this.ingredients.remove(ingredient);
    }

    public double getDishPrice() {
        double totalPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            totalPrice += ingredient.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return String.format("Dish{id=%d, name='%s', dishType=%s, ingredients=%d, totalPrice=%.2f}",
                id, name, dishType, ingredients.size(), getDishPrice());
    }
}