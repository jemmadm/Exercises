package Exercise2;

import java.util.Scanner;

public class Exercise2CountingCharacters {

    public static void main(String[] args) {
        System.out.println("What is the input string?");

        String input = new Scanner(System.in).nextLine();

        if (input.equals("")) {
            System.out.println("You must enter an input");
        } else {
            System.out.println(input + " has " + input.length() + " characters");
        }
    }


}
