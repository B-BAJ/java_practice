//to write a program that tells the user to input a number then 
//to check if the program is even or odd ->logic if input%2 = 0 even else odd

import java.util.Scanner;

public class CheckEveness {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input an integer to be checked");

        int input = sc.nextInt();

        if (input % 2 == 0) {
            System.out.println(input + " the number is even ");
        }else{
            System.out.println(input + " the number is odd");
        }
        sc.close();
}
    
}
