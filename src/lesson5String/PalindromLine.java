package lesson5String;

import java.util.Scanner;


public class PalindromLine {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter line:");
        String myLine = in.nextLine();
        System.out.println(isLinePalindrom(myLine));
    }

    private static boolean isLinePalindrom(String myLine) {

        myLine = myLine.toLowerCase();
        String lineWithoutCharacters = myLine.replaceAll("[\\W]", "");

        StringBuilder builder = new StringBuilder(lineWithoutCharacters);
        String builderMyLine = builder.reverse().toString();

        return (lineWithoutCharacters.equals(builderMyLine));
    }
}
