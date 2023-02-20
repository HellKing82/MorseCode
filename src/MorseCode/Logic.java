package MorseCode;

import java.util.HashMap;
import java.util.Scanner;

public class Logic {

    private HashMap<String, String> morse = new HashMap<>();
    Scanner scan = new Scanner(System.in);

    public Logic() {

        morse.put("a", ".- ");
        morse.put("b", "-... ");
        morse.put("c", "-.-. ");
        morse.put("d", "-.. ");
        morse.put("e", ". ");
        morse.put("f", "..-. ");
        morse.put("g", "--. ");
        morse.put("h", ".... ");
        morse.put("i", ".. ");
        morse.put("j", ".--- ");
        morse.put("k", "-.- ");
        morse.put("l", ".-.. ");
        morse.put("m", "-- ");
        morse.put("n", "-. ");
        morse.put("o", "--- ");
        morse.put("p", ".--. ");
        morse.put("q", "--.- ");
        morse.put("r", ".-. ");
        morse.put("s", "... ");
        morse.put("t", "- ");
        morse.put("u", "..- ");
        morse.put("v", "...- ");
        morse.put("w", ".-- ");
        morse.put("x", "-..- ");
        morse.put("y", "-.-- ");
        morse.put("z", "--.. ");
        morse.put("1", ".---- ");
        morse.put("2", "..--- ");
        morse.put("3", "...-- ");
        morse.put("4", "....- ");
        morse.put("5", "..... ");
        morse.put("6", "-.... ");
        morse.put("7", "--.... ");
        morse.put("8", "---.. ");
        morse.put("9", "----. ");
        morse.put("0", "----- ");
        morse.put(" ", "| ");
        morse.put(",", "--..-- ");
        morse.put("?", "..--.. ");
        morse.put("!", "-.-.-- ");
        morse.put(":", "---... ");
        morse.put("*", ".-.-.- ");

        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");
        morse.put(".----", "1");
        morse.put("..---", "2");
        morse.put("...--", "3");
        morse.put("....-", "4");
        morse.put(".....", "5");
        morse.put("-....", "6");
        morse.put("--...", "7");
        morse.put("---..", "8");
        morse.put("----.", "9");
        morse.put("-----", "0");
        morse.put("|", " ");
        morse.put("--..--", ",");
        morse.put("..--..", "?");
        morse.put("-.-.--", "!");
        morse.put("---...", ":");
        morse.put(".-.-.-", "*");
    }

    public String getTranslate(String input) {
        String Inputout = "";

        if (input.contains(".") || (input.contains("-"))) {
            String[] outPutMorse = input.split(" ");

            for (int i = 0; i < outPutMorse.length; i++) {
                Inputout += morse.get(outPutMorse[i]);
            }
        } else {
            String[] outPutEnglish = input.split("");
            for (int i = 0; i < outPutEnglish.length; i++) {
                Inputout += morse.get(outPutEnglish[i]);
                Inputout.split(" ");
            }
        }
        System.out.println(Inputout);
        return Inputout;
    }

    public String GetSmallText(String testData) {

        return testData.toLowerCase();
    }

    public String GetIsLetter(String testData) {
        return testData;
    }
}

