package day4.task2;

import java.util.List;

/**
 * todo Document type Chef
 */
public class Chef{

    private String name;

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Burger makeBurger(List<Ingredients> ingredients) throws BurgerException {
        if (validate(ingredients)){
            return new Burger(arrangeCheeseAndSalad(
                arrangeBuns(ingredients)), this);
        }
        else{
            throw new BurgerException("В данном наборе не хватает ингридиентов " + ingredients);
        }
    }

    public boolean validate(List<Ingredients> list) {
        boolean containsMeat = list.contains(Ingredients.MEAT);

        int bunCount = 0;
        for (Ingredients ingredients : list) {
            if (ingredients.equals(Ingredients.BUN)) {
                bunCount++;
            }
        }
        boolean containsEnoughBuns = bunCount <= 3 && bunCount > 1;

        return containsMeat && containsEnoughBuns;
    }

    public List<Ingredients> arrangeCheeseAndSalad(List<Ingredients> ingredients) {
        int saladI = ingredients.indexOf(Ingredients.SALAD);

        if(saladI != -1){
            ingredients.remove(saladI);
            ingredients.add(ingredients.size() - 1, Ingredients.SALAD);
        }

        int cheeseI = ingredients.lastIndexOf(Ingredients.CHEESE);
        if(cheeseI != -1) {
            ingredients.remove(cheeseI);
            int meatI = ingredients.indexOf(Ingredients.MEAT);
            ingredients.add(meatI, Ingredients.CHEESE);
        }
        return ingredients;
    }

    public List<Ingredients> arrangeBuns(List<Ingredients> ingredients) {
        int countBuns = 0;
        for (int i = 0; i < 3; i++) {
            int bunI = ingredients.indexOf(Ingredients.BUN);
            if (bunI == -1) {
                break;
            } else {
                ingredients.remove(bunI);
                countBuns++;
            }
        }
        ingredients.add(Ingredients.BUN);
        ingredients.add(0, Ingredients.BUN);
        if(countBuns == 3){
            ingredients.add(ingredients.size()/2, Ingredients.BUN);
        }
        return ingredients;
    }
}
