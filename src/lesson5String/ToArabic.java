package lesson5String;

import java.util.Scanner;

public class ToArabic {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Roma number:");
        int arabicResult = replaceRomaToArabic(in.nextLine());
        if (arabicResult > 3999 || arabicResult < 0) {
            System.out.println("I don't understand your number :(");
        } else {
            System.out.println("Arabic numb is: " + arabicResult);
        }

    }


    private static int replaceRomaToArabic(String line) {

        int result = createArabic(line.charAt(0));
        for (int index = 0; index < line.length(); index++) {

            if (index == 0) {
                continue;
            }

            int previous = createArabic(line.charAt(index - 1));
            int current = createArabic(line.charAt(index));

            if (previous < current) {
                result = result + current - 2 * previous;
            } else {
                result = result + current;
            }
        }

        return result;
    }

    private static int createArabic(char character) {

        int num = 0;
        switch (character) {
            case 'I':
                num = 1;
                break;
            case 'V':
                num = 5;
                break;
            case 'X':
                num = 10;
                break;
            case 'L':
                num = 50;
                break;
            case 'C':
                num = 100;
                break;
            case 'D':
                num = 500;
                break;
            case 'M':
                num = 1000;
                break;
            default:
                System.out.println("Oops! Something's wrong..");
        }

        return num;
    }

}
