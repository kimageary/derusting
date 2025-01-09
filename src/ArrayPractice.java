public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] myArray = new String[4];
    // Set the value of the array at each index to be a different String
    myArray[0] = "Hello";
    myArray[1] = "Tissue";
    myArray[2] = "Phone";
    myArray[3] = "Cup";
    // It's OK to do this one-by-one

    // Get the value of the array at index 2
    System.out.println(myArray[2]);

    // Get the length of the array
    System.out.println("Length of array" + myArray.length);
    // Iterate over the array using a traditional for loop and print out each item
    for(int i =0; i<myArray.length; i++){
      System.out.println(myArray[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    for(String item: myArray){
      System.out.println(item);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
