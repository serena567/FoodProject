package edu.meu.mgen.data;

public class Main {

    // Food class nested within Main class
    static class Food {
        private String name;
        private double calories;
        private double protein;

        // Constructor to initialize the food object with name, calories, and protein
        public Food(String name, double calories, double protein) {
            this.name = name;
            this.calories = calories;
            this.protein = protein;
        }

        // Getter for the name of the food
        public String getName() {
            return name;
        }

        // Getter for the calorie content of the food
        public double getCalories() {
            return calories;
        }

        // Getter for the protein content of the food
        public double getProtein() {
            return protein;
        }

        // Override toString method to provide a readable representation of the food
        // object
        @Override
        public String toString() {
            // Remove portionSize and keep the other details
            return "Food{name='" + name + "', calories=" + calories +
                    ", protein=" + protein + "g}";
        }
    }

    public static void main(String[] args) {
        // Create Food objects with calorie and protein information for each food item
        Food milk = new Food("Milk", 150.0, 8.0);
        Food coffee = new Food("Coffee", 5.0, 0.3);
        Food tea = new Food("Tea", 5.0, 0.5);
        Food bread = new Food("Bread", 1250.0, 30.0);
        Food beef = new Food("Beef", 900.0, 90.0);
        Food rice = new Food("Rice", 670.0, 13.0);
        Food chicken = new Food("Chicken", 725.0, 90.0);
        Food pizza = new Food("Pizza", 1300.0, 50.0);
        Food broccoli = new Food("Broccoli", 155.0, 13.0);
        Food spinach = new Food("Spinach", 145.0, 12.0);

        // Output the information of each Food object
        System.out.println(milk);
        System.out.println(coffee);
        System.out.println(tea);
        System.out.println(bread);
        System.out.println(beef);
        System.out.println(rice);
        System.out.println(chicken);
        System.out.println(pizza);
        System.out.println(broccoli);
        System.out.println(spinach);
    }
}
