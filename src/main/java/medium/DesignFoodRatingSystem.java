package medium;

import java.util.*;

public class DesignFoodRatingSystem {
}

class FoodRatings {

    public class food{
        public String foodName;
        public String cuisine;
        public int rating;

        public food(String food, String cuisine, int rating){
            this.foodName=food;
            this.cuisine=cuisine;
            this.rating=rating;
        }
    }

    private Map<String, food> foodToFood;
    private Map<String, TreeSet<food>> cuisineToFood;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        this.foodToFood = new HashMap<>();
        this.cuisineToFood = new HashMap<>();

        for(int i=0; i<foods.length;i++){
            food tempFood = new food(foods[i],cuisines[i],ratings[i] );
            foodToFood.putIfAbsent(foods[i], tempFood);
            cuisineToFood.putIfAbsent(cuisines[i], new TreeSet<>((a,b)->{
                if(a.rating!=b.rating) return b.rating - a.rating;
                return a.foodName.compareTo(b.foodName);
            }) );
            cuisineToFood.get(cuisines[i]).add(tempFood);
        }
    }

    public void changeRating(String food, int newRating) {

        food f = foodToFood.get(food);

        TreeSet<food> set = cuisineToFood.get(f.cuisine);

        set.remove(f);
        f.rating = newRating;
        set.add(f);
    }

    public String highestRated(String cuisine) {
        if(cuisineToFood.containsKey(cuisine)){
            return cuisineToFood.get(cuisine).first().foodName;
        }else{
            return null;
        }
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */