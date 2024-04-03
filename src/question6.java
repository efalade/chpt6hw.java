import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class CentennialRemovalExample {
    public static void main(String[] args) {
        // Initialize ArrayList with LocalDate objects for specific centennials
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1900, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        // Print the list before removing the incorrect date
        System.out.println("Before removal:");
        printList(centennials);
        System.out.println("size = " + centennials.size());

        // Remove the incorrect date (July 4, 1900) from the list
        centennials.removeIf(date -> date.getYear() == 1900);

        // Print the list after removing the incorrect date
        System.out.println("\nAfter removal:");
        printList(centennials);
        System.out.println("size = " + centennials.size());
    }

    // Helper method to print dates in the list in a specific format
    private static void printList(ArrayList<LocalDate> list) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        for (LocalDate date : list) {
            System.out.println(date.format(formatter));
        }
    }
}
