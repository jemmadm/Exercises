package Exercise4;

import java.util.Scanner;

public class Exercise4MadLib {


    public static void main(String[] args) {

        System.out.println("Enter a noun:");
        String noun = new Scanner(System.in).next();

        System.out.println("Enter a verb:");
        String verb = new Scanner(System.in).next();

        System.out.println("Enter an adjective:");
        String adjective = new Scanner(System.in).next();

        System.out.println("Enter an adverb:");
        String adverb = new Scanner(System.in).next();


        System.out.println(new StringBuilder("Do you ").append(verb).append(" your ").append(adjective).append(" ").append(noun).append(" ").append(adverb).append("?"));

    }

}

