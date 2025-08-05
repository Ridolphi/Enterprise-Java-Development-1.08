import java.math.BigDecimal;
import bigdecimaloperations.BigDecimalOperations;
import carinventory.*;
import videostreaming.*;
import intlist.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== BigDecimal Operations ===");
        BigDecimal num1 = new BigDecimal("4.2545");
        System.out.println("Original: " + num1);
        System.out.println("Rounded to hundredth: " + BigDecimalOperations.roundToNearestHundredth(num1));

        BigDecimal num2 = new BigDecimal("-45.67");
        System.out.println("\nOriginal: " + num2);
        System.out.println("Reversed and rounded: " +
                BigDecimalOperations.reverseSignAndRoundToNearestTenth(num2));

        System.out.println("\n\n=== Car Inventory System ===");

        Car sedan = new Sedan("1HGCM82633A", "Honda", "Accord", 35000);
        System.out.println(sedan.getInfo());

        Car utility = new UtilityVehicle("JM3KE4DY4F", "Mazda", "CX-5", 22000, true);
        System.out.println(utility.getInfo());

        Car truck = new Truck("1FTFW1ET8E", "Ford", "F-150", 45000, 5.5);
        System.out.println(truck.getInfo());

        System.out.println("\n\n=== Video Streaming Service ===");
        Video movie = new Movie("Inception", 148, 8.8);
        System.out.println(movie.getInfo());

        Video series = new TvSeries("Stranger Things", 50, 25);
        System.out.println(series.getInfo());

        System.out.println("\n\n=== IntList Implementations ===");

        System.out.println("--- IntArrayList ---");
        IntList arrayList = new IntArrayList();
        for (int i = 1; i <= 15; i++) {
            arrayList.add(i * 10);
        }
        System.out.println("Element at index 10: " + arrayList.get(10));

        System.out.println("--- IntVector ---");
        IntList intVector = new IntVector();
        for (int i = 1; i <= 25; i++) {
            intVector.add(i * 5);
        }
        System.out.println("Element at index 20: " + intVector.get(20));
    }
}