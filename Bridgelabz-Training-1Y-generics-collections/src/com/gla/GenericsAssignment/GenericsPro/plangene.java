package com.gla.GenericsAssignment.GenericsPro;

interface MealPlan {}

class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}

class Meal<T extends MealPlan> {

    T meal;

    void setMeal(T meal){
        this.meal = meal;
    }

    T getMeal(){
        return meal;
    }

    static <T extends MealPlan> void generate(T meal){
        System.out.println("Generated: " + meal.getClass().getSimpleName());
    }
}
