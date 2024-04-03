public class DiceArrayExample2 {
    public static void main(String[] args) {
        // Create an array to hold 6 dice rolls
        int[] dice2 = new int[6];
        // Populate the array with random numbers between 1 and 6
        for (int i = 0; i < dice2.length; i++) {
            dice2[i] = (int) (Math.random() * 6) + 1;
        }
        // Print the array using an indexed for loop
        System.out.print("dice2 = ");
        for (int i = 0; i < dice2.length; i++) {
            System.out.print(dice2[i] + " ");
        }
    }
}

