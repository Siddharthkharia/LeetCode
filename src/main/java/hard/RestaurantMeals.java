package hard;

import java.util.*;

public class RestaurantMeals {
    static class Meal {
        Map<String, Integer> items;
        int price;

        Meal(Map<String, Integer> items, int price) {
            this.items = items;
            this.price = price;
        }
    }

    // Test
    public static Map<String, Integer> memo;
    public static void main(String[] args) {
        Map<String, Integer> menu = new HashMap<>();
        menu.put("Burger", 50);
        menu.put("Fries", 30);
        menu.put("Coke", 20);

        List<Meal> meals = new ArrayList<>();
        Map<String, Integer> meal1 = new HashMap<>();
        meal1.put("Burger", 1);
        meal1.put("Fries", 1);
        meals.add(new Meal(meal1, 70));

        Map<String, Integer> meal2 = new HashMap<>();
        meal2.put("Fries", 1);
        meal2.put("Coke", 1);
        meals.add(new Meal(meal2, 40));

        List<String> order = Arrays.asList("Burger", "Fries", "Coke");

        int result = bestPrice(menu, meals, order);
        System.out.println("Best Price: " + result);
    }

    public static int bestPrice(Map<String, Integer> menu, List<Meal> meals, List<String> order){
        memo= new HashMap<>();
        Map<String, Integer> needed = new HashMap<>();
        int itemRemainingCount = order.size();
        for(int i =0 ;i<itemRemainingCount;i++){
            needed.put(order.get(i), needed.getOrDefault(order.get(i),0)+1);
        }

        List<String> menuItems = new ArrayList(menu.keySet());
        int[] countOfItemsNeeded = new int[menuItems.size()];

        for(int i=0;i<menuItems.size();i++){
            countOfItemsNeeded[i]= needed.getOrDefault(menuItems.get(i),0);
        }
        Map<String, Integer> memo = new HashMap<>();
        return dfs(menuItems,menu,countOfItemsNeeded,meals);
    }

    private static int dfs(List<String> menuItems,Map<String, Integer> menu, int[] countOfItemsNeeded, List<Meal> meals) {
        String mealsString = Arrays.toString(countOfItemsNeeded);
        if(memo.containsKey(mealsString)){
            return memo.get(mealsString);
        }

        int cost=0;
        for(int i=0;i<countOfItemsNeeded.length;i++){
            cost=cost+ countOfItemsNeeded[i]*menu.get(menuItems.get(i));
        }

        for(Meal meal:meals){
            int[] next = Arrays.copyOf(countOfItemsNeeded, countOfItemsNeeded.length);
            boolean canUse = true;

            for(int i =0;i<menuItems.size();i++){
                int mealItemCount = meal.items.getOrDefault(menuItems.get(i),0);

                if(next[i]< mealItemCount){
                    canUse=false;
                    break;
                }
                next[i]=next[i]-mealItemCount;
            }
            if(canUse){
                cost=Math.min(cost, meal.price+dfs(menuItems,menu,next,meals));
            }
        }
        memo.put(mealsString,cost);
            return cost;
    }


}
