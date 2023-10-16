package com.pluralsight;
import java.util.*;

public class FamousQuotes {
    public static void main(String[] args) {

        String[] quotes = new String[10];


        quotes[0] = "I drink, and I know things. - Tyrion Lannister";
        quotes[1] = "What are you gonna do, stab me? - Man who got stabbed";
        quotes[2] = "I am not a crook. - Richard Milhouse Nixon";
        quotes[3] = "Noh, nowy tends - Ned Stark";
        quotes[4] = "You kiss your dad on the mouth? - Charlie, from Smiling Friends.";
        quotes[5] = "TOSS ME! - Gimli.";
        quotes[6] = "I just blue myself. - Tobias Funke, Arrested Development.";
        quotes[7] = "You know nuffin', Jon Snow - Ygritte.";
        quotes[8] = "I've never felt such a mixture of pity, and indigestion. - Mr. Krabs.";
        quotes[9] = "If you are a racist, I will attack you with the north. - Abraham Lincoln (Michael Scott).";


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number (1-10) to see a quote: ");
        int number = keyboard.nextInt();

        if (number >= 1 && number <= 10) {
            System.out.println("Quote " + number + ": " + quotes[number - 1]);
        }
        try {
            String selectedQuote = quotes[number - 1];
            System.out.println("Quote " + number + ": " + selectedQuote);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input. Please enter a number between 1 and 10.");
        }
    }
}


