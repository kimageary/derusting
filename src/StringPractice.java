import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String myString = "hello";
    // Find the length of the string
    System.out.println("String length: " + myString.length());

    // Concatenate (add) two strings together and reassign the result
    String string2 ="goodbye";
    String newString = myString + string2;
    System.out.println(newString);

    // Find the value of the character at index 3
    System.out.println(myString.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(myString.contains("abc"));

    // Iterate over the characters of the string, printing each one on a separate line
    for(int i=0; i<myString.length(); i++){
      System.out.println(myString.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> list = new ArrayList<String>();

    // Add multiple strings to the List (OK to do one-by-one)
    list.add("Hello");
    list.add("Good");
    list.add("Oui");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedString = String.join(", ", list);
    System.out.println(joinedString);

    // Check whether two strings are equal
    joinedString.equals(myString);
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
