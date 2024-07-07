package exam_sv3_part1_potpot.cookbook;

import java.util.ArrayList;
import java.util.List;

public class CookBook {

    private List<Recipe> recipes = new ArrayList<>();

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public boolean addRecipe(Recipe recipe) {

        if (recipe.getDifficulty() == Difficulty.HARD) {
            recipes.add(recipe);
            return true;
        }

        if (recipe.getIngredients().size() <= 10) {
            recipes.add(recipe);
            return true;
        }

        return false;
    }

    public boolean isRecipeInCookbookWithDifficulty(Difficulty difficulty) {
        for (Recipe recipe : recipes) {
            if (recipe.getDifficulty() == difficulty) {
                return true;
            }
        }
        return false;
    }

    public int findNumberOfMaxIngredients() {
        int max = 0;
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().size() > max) {
                max = recipe.getIngredients().size();
            }
        }
        return max;
    }

    public int countRecipeWithIngredient(String ingredient){
        int count =0;
        for (Recipe recipe : recipes) {
            if (recipe.containsIngredient(ingredient)){
                count++;
            }
        }
        return count;
    }

}
