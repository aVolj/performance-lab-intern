package day4.task2;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.random;

/**
 * todo Document type IngredientsGenerator
 */
public class IngredientsGenerator {

    public static List<Ingredients> generateIngredients(){
        List<Ingredients> ingredients = new ArrayList<>();
        int ingredientCount = (int) (random() * 10); //кол-во ингридиентов в упаковке
        for (int i = 0; i < ingredientCount; i++) {
            int ingredientNumber = (int) (random() * 8); //генерация номера ингредиента
            Ingredients currentIngredients =
                Ingredients.values()[ingredientNumber];
            ingredients.add(currentIngredients);
        }
        return ingredients;
    }

    public static List<List<Ingredients>> generateIngredients(int count){
        List<List<Ingredients>> pileOfIngredients = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            pileOfIngredients.add(generateIngredients());
        }
        return pileOfIngredients;

    }
}
