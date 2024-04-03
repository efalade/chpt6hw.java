import java.util.ArrayList;

public class DiceArrayListExample4 {
    public static void main(String[] args) {
        // Create an ArrayList to store 5 dice rolls
        ArrayList<Integer> dice4 = new ArrayList<>();
        // Add 5 random dice rolls to the ArrayList
        for (int i = 0; i < 5; i++) {
            dice4.add((int) (Math.random() * 6) + 1);
        }
        // Print the ArrayList using an enhanced for loop
        System.out.print("dice4 = ");
        for (int roll : dice4) {
            System.out.print(roll + " ");
        }
    }
}
