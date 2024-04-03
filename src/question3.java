import java.util.ArrayList;

public class DiceArrayListExample3 {
    public static void main(String[] args) {
        // Create an ArrayList to store dice rolls
        ArrayList<Integer> dice3 = new ArrayList<>();
        // Add 10 random dice rolls to the ArrayList
        for (int i = 0; i < 10; i++) {
            dice3.add((int) (Math.random() * 6) + 1);
        }
        // Print the ArrayList using an enhanced for loop
        System.out.print("dice3 = ");
        for (int roll : dice3) {
            System.out.print(roll + " ");
        }
    }
}
