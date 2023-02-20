package MorseCode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Welcome to the Morse/English or English/Morse translate.");
        System.out.println("If you want to translate Morse, use space between each letter and | when you want a space.");
        System.out.println();
        System.out.println("Input what you want to translate:");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        text = text.toLowerCase();
        Logic InputLogic = new Logic();
        System.out.println();
        System.out.println("Your translate input is: ");
        text = InputLogic.getMorseCode(text);
    }
}