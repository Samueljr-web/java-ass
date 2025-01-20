// Declare an array of length 10.
// Write a program using a loop to assign elements to the array by accepting input from the user. Make sure to state the index that the user’s input will be to the user before accepting the input.
// Using a for each loop, print out the input entered by the user.


import java.util.Scanner;
  public class arrayLength {
    public static void main(String[] args) {
        String[] arr = new String[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a value for index " + i + ": ");
            arr[i] = input.nextLine();
        }
        for (String element : arr) {
            System.out.println(element);
        }
        
    }
  }