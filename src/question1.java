public class DiceArrayExample1 {
    public static void main(String[] args) {
        // Create an array to hold 10 dice rolls
        int[] dice1 = new int[10];
        // Populate the array with random numbers between 1 and 6
        for (int i = 0; i < dice1.length; i++) {
            dice1[i] = (int) (Math.random() * 6) + 1;
        }
        // Print the array using an enhanced for loop
        System.out.print("dice1 = ");
        for (int roll : dice1) {
            System.out.print(roll + " ");
        }
    }
}
