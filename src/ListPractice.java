import java.util.ArrayList; 
import java.util.Collections; 
public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> list = new ArrayList<String>();
    // Add 3 elements to the list (OK to do one-by-one)
    list.add("Hello");
    list.add("Good");
    list.add("Node");

    System.out.println("New list: " + list);
    // Print the element at index 1
    System.out.println(list.get(1));
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    list.set(1, "Bad");
    System.out.println("Updated List: " + list);

    // Insert a new element at index 0 (the length of the list will change)
    list.add(0, "Food");
    System.out.println("Expected: Food, Hello, Bad, Node    | " + list);

    // Check whether the list contains a certain string
    System.out.println(list.contains("Food"));
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
    // Sort the list using the Collections library
    Collections.sort(list);
    System.out.println(list);
    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for(String item : list){
      System.out.println(item);
    }
    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}