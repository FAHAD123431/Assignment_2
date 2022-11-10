import java.util.Scanner;

public class Assignment_2 {
    public static final double MIN_SCORE = 0.0;

    public static final double MAX_SCORE = 10.0;

    public static String calculateISBNCheck(int number) {

        String numberLength = Integer.toString(number);

        int sum;

        String ISBN = "";

        int remainder = 0;

        int checkDigit = 0;

        String val = "";

        if (numberLength.length() == 9) {

            sum = ((number / 100000000) * 10) + (((number % 100000000) / 10000000) * 9) + (((number % 10000000) / 1000000) * 8) + (((number % 1000000) / 100000) * 7) + (((number % 100000) / 10000) * 6) + (((number % 10000) / 1000) * 5) + (((number % 1000) / 100) * 4) + (((number % 100) / 10) * 3) + ((number % 10) * 2);

            if (sum % 11 != 0) {

                remainder = sum % 11;

            } else if (sum % 11 == 0) {

                remainder = 0;

            }

            if (remainder == 0)

                checkDigit = 0;

            else

                checkDigit = 11 - remainder;

            if (checkDigit == 1) {

                val = "X";

            } else if (checkDigit != 1) {

                val = Integer.toString(checkDigit);

            } else if (checkDigit == 0)

                val = "0";

            ISBN = numberLength + val;

            return ISBN;

        } else

            return "please input a valid number";

    }

    public static boolean isValidDNA(String str) {

        if (((str.indexOf("A") >= 0) || (str.indexOf("a") >= 0)) && ((str.indexOf("C") >= 0 || str.indexOf("c") >= 0)) && ((str.indexOf("T") >= 0 || str.indexOf("t") >= 0)) && ((str.indexOf("G") >= 0) || (str.indexOf("g") >= 0)))

            return true;

        else

            return false;

    }

    public static int calculateCommon(String str1, String str2) {

        String unify = str1.toLowerCase();

        String secondUnify = str2.toLowerCase();

        int counter = 0;

        int i = 0;

        while ((i < unify.length()) && (i < secondUnify.length())) {

            if (unify.charAt(i) == secondUnify.charAt(i))

                counter++;

            i++;

        }

        if (counter == 1)

            return 1;

        else

            return 2;

    }

    public static boolean checkPalindrome(int num) {

        /* Write your code here */

        String strNumber = Integer.toString(num);

        int i = strNumber.length();

        String reversedNumber = "";

        while (i > 0) {

            reversedNumber = reversedNumber + strNumber.charAt(i - 1);

            i--;

        }

        if (strNumber.equals(reversedNumber))

            return true;

        else

            return false;

    }

    public static int drawBarChart(int num) {

        String asterisk = "*";

        String numberToString = Integer.toString(num);

        int firstNumber = num / 10000;

        int secondNumber = (num % 10000) / 1000;

        int thirdNumber = (num % 1000) / 100;

        int fourthNumber = (num % 100) / 10;

        int fifthNumber = num % 10;

        if (numberToString.length() == 5 && checkPalindrome(num) == true) {

            System.out.print(Integer.toString(firstNumber) + ": " + asterisk.repeat(firstNumber) + Integer.toString(secondNumber) + ": " + asterisk.repeat(secondNumber) + Integer.toString(thirdNumber) + ": " + asterisk.repeat(thirdNumber) + Integer.toString(fourthNumber) + ": " + asterisk.repeat(fourthNumber) + Integer.toString(fifthNumber) + ": " + asterisk.repeat(fifthNumber));

        }

        return firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a 9 digit number");

        int n1 = input.nextInt();

        System.out.println(calculateISBNCheck(n1));

        System.out.println("---------------------------");

        System.out.println("Please enter a DNA sequence");

        String dna = input.next();

        System.out.println(isValidDNA(dna));

        System.out.println("----------------------------");

        System.out.println("Please enter two strings");

        String str1 = input.next();

        String str2 = input.next();

        System.out.println(calculateCommon(str1, str2));

        System.out.println("----------------------------");

        System.out.println("Plesae enter a five digit number");

        int n2 = input.nextInt();

        input.close();

    }

}

