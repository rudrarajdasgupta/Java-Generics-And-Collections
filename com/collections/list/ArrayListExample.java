import java.util.ArrayList;

/**
 * Example demonstrating the usage of ArrayList in Java.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Accessing elements
        System.out.println(arrayList.get(1)); // Output: Banana

        // Removing an element
        arrayList.remove("Orange");

        // Iterating over the ArrayList
        for (String item : arrayList) {
            System.out.println(item);
        }
    }
}