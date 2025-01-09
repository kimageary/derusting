public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float newFloat = -4.545f;
    System.out.println(newFloat);

    // Create an int with a positive value and assign it to a variable
    int newInt = 36;
    System.out.println(newInt);

    // Use the modulo % operator to find the remainder when the int is divided by 3
    float remainder = newInt % 3;
    System.out.println(remainder);

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
      if(newInt % 2 == 0){
        System.out.println("This number is even");
      }else{
        System.out.println("This number is odd!");
      }

    // Divide the number by another number using integer division

    int division = newInt / 4;
    System.out.println(division);
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
