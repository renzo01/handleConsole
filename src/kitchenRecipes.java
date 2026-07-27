public class kitchenRecipes {
    public static void main(String[] args) {
        var console = new java.util.Scanner(System.in);
        System.out.println("Welcome to the Kitchen Recipes Management System!");
        System.out.println("Please enter the recipe name: ");
        var recipeName = String.valueOf(console.nextLine());
        System.out.println("Please enter the main ingredient: ");
        var mainIngredient = String.valueOf(console.nextLine());
        System.out.println("Please enter the cooking time in minutes: ");
        var cookingTime = Integer.parseInt(console.nextLine());
        System.out.println("Please enter the difficulty level: ");
        var difficulty = String.valueOf(console.nextLine());
        console.close();
        System.out.println("Recipe Details:");
        System.out.println("Name: " + recipeName);
        System.out.println("Main Ingredient: " + mainIngredient);
        System.out.println("Cooking Time: " + cookingTime + " minutes");
        System.out.println("Difficulty Level: " + difficulty);
    }
}
