import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionExample {
    public static void main(String[] args) {
        // Define two arrays with integer elements
        int[] list1 = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 9, 10};
        int[] list2 = {2, 4, 8, 10, 12, 14, 16, 18, 20};
        // Use a HashSet to store unique elements from list1
        HashSet<Integer> set = new HashSet<>();
        // ArrayList to store the intersection of list1 and list2
        ArrayList<Integer> intersection = new ArrayList<>();

        // Add elements of list1 to the set to ensure uniqueness
        for (int item : list1) {
            set.add(item);
        }
        // Check each element in list2; if it is in set, add to intersection
        for (int item : list2) {
            if (set.contains(item)) {
                intersection.add(item);
            }
        }
        // Print the intersection
        System.out.print("Intersection = ");
        for (int item : intersection) {
            System.out.print(item + " ");
        }
    }
}
