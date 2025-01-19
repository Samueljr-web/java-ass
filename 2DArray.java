// number 5
// Declare a 2D array of size 10 by 10.
// Write a program using a loop to assign elements to the array by accepting input from the user. Make sure to state the index that the user’s input will be to the user before accepting the input.
// Using a for each loop, print out the input entered by the user.

import java.util.Scanner;

public class flag {
    public static void main(String[] args) {
     
            String[][] arr = new String[10][10];
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.println("Enter a value for index " + i + ", " + j);
                    arr[i][j] = input.nextLine();
                }
            }
        }
    }
