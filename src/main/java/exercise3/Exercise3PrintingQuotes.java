package exercise3;

import java.util.Scanner;

public class Exercise3PrintingQuotes {

    public static void main(String[] args) {
        System.out.println("What is the quote?");
        String quote = new Scanner(System.in).nextLine();
        System.out.println("Who said it?");
        String author = new Scanner(System.in).nextLine();
        System.out.println(author + " says, " + "\"" + quote + "\"");

    }
}
