import java.util.Random;

public class JeuDeDes {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Random random = new Random();
        int randomNumberOne = random.nextInt(1, 12);
        int randomNumberTwo = random.nextInt(1, 12);
        int sum = randomNumberOne + randomNumberTwo;

        System.out.print("Dé 1: " + randomNumberOne + "\nDé 2: " + randomNumberTwo + "\n");
        System.out.print("Somme: " + sum);
    }
}