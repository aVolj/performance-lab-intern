package day4.task2;

import java.util.List;

/**
 * todo Document type Burger
 */
public class Burger {
    private List<Ingredients> ingredients;
    private Chef cook;

    public Burger(List<Ingredients> ingredients, Chef cook) {
        this.ingredients = ingredients;
        this.cook = cook;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public Chef getCook() {
        return cook;
    }

    public void setCook(Chef cook) {
        this.cook = cook;
    }

    public void printComposition(){
        System.out.println("Состав бургера: " + getIngredients() +
            " приготовил " + getCook().getName());
    }
}
