//------------------------------------------------------------------------------------------------------------ identical Arrays ------------------------------------------------------------------------------------------------------------//
//This program will determine whether two arrays are identical.
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        int counter1 = 0;
        int counter2 = 0;

        //Arrays
        int[] user1 = new int[5];
        int[] user2 = new int[5];

        //Menu
        System.out.println("Welcome!\nThis program will determine whether two arrays are identical.\nUser 1 Please enter an Array of 5 integers.\n");

        //Collect user1 input
        for (int i = 0; i < user1.length; i++) {
            counter1 += 1;
            System.out.println("Please enter num " + counter1 + " : ");
            user1[i] = sc.nextInt();
        }

        //Print Out Array.
        System.out.println("Thank You!\n" + "Your Array : " + Arrays.toString(user1));

        //Collect user2 input
        System.out.println("\nUser 2 Please enter an Array of 5 integers.");
        for (int j = 0; j < user2.length; j++) {
            counter2 += 1;
            System.out.println("Please enter num " + counter2 + " : ");
            user2[j] = sc.nextInt();
        }

        //Print Out Array.
        System.out.println("Thank You!\n" + "Your Array : " + Arrays.toString(user2));

        // Comparing the two arrays to see if they are equal.
        boolean result = Arrays.equals(user1, user2);

        if (result){
            System.out.println("\nThe Two Arrays Are Identical ");
        }
        else {
        System.out.println("\nThe Two Arrays Are Not Identical ");
        }
    }
}
