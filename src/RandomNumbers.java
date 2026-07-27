import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("Random Numbers Generator");
        var random = new Random();
        var randomNumbers = random.nextInt(10);
        System.out.println("Random Number: " + randomNumbers);
        //generate a random number between 1 and 10
        randomNumbers = random.nextInt(10) + 1;
        System.out.println("Random Number between 1 and 10: " + randomNumbers);

        //generate a float number between 0.0 and 1.0
        var randomFloat = random.nextFloat();
        System.out.println("Random Float Number between 0.0 and 1.0: " + randomFloat);

        //Simulate a dice roll (1 to 6)
        var diceRoll = random.nextInt(6) + 1;
        System.out.println("Simulated Dice Roll (1 to 6): " + diceRoll);
    }
}
