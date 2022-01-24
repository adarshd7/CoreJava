package main;
import java.util.Random;
public class DiceRoll {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Roll three times");
        for (int i = 0; i < 3; i++) {
            int roll = random.nextInt(6) + 1;
            System.out.println(roll);

        }
    }
}
