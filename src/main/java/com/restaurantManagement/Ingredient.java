package com.restaurantManagement;

public class Ingredient {
    private int id;
    private String name;
    private double price;
    private IngredientCategory category;
    private Integer dishId;

    public Ingredient(int id, String name, double price, IngredientCategory category, Integer dishId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.dishId = dishId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public IngredientCategory getCategory() {
        return category;
    }

    public void setCategory(IngredientCategory category) {
        this.category = category;
    }

    public Integer getDishId() {
        return dishId;
    }

    public void setDishId(Integer dishId) {
        this.dishId = dishId;
    }

    // getPrice() method needed for Dish.getDishPrice() calculation
}