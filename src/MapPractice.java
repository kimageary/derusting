import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> myMap = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    myMap.put("Alice", 25);
    myMap.put("Bob", 30);
    myMap.put("Charlie", 35);

    // Get the value associated with a given key in the Map
    String keyToGet = "Bob";
    Integer value = myMap.get(keyToGet);
    System.out.println("Value associated with key '" + keyToGet + "': " + value);

    // Find the size (number of key/value pairs) of the Map
    System.out.println("Size of the map: " + myMap.size());

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    myMap.put("Alice", 26); // Replace the value for key "Alice"
    System.out.println("Updated value for key 'Alice': " + myMap.get("Alice"));

    // Check whether the Map contains a given key
    String keyToCheck = "Charlie";
    if (myMap.containsKey(keyToCheck)) {
        System.out.println("The map contains the key '" + keyToCheck + "'.");
    } else {
        System.out.println("The map does not contain the key '" + keyToCheck + "'.");
    }

    // Check whether the Map contains a given value
    int valueToCheck = 30;
    if (myMap.containsValue(valueToCheck)) {
        System.out.println("The map contains the value " + valueToCheck + ".");
    } else {
        System.out.println("The map does not contain the value " + valueToCheck + ".");
    }

    // Iterate over the keys of the Map, printing each key
    System.out.println("Keys in the map:");
    for (String key : myMap.keySet()) {
        System.out.println(key);
    }

    // Iterate over the values of the map, printing each value
    System.out.println("Values in the map:");
    for (Integer val : myMap.values()) {
        System.out.println(val);
    }

    // Iterate over the entries in the map, printing each key and value
    System.out.println("Entries in the map:");
    for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
