package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//	    int value = 1;
//	    if(value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }


        // Switch statements can be used with byte, short, char, and int 'primitive' data types

	    int switchValue = 3;

	    switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // Switch statement challenge
        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char letter = 'A';

	    switch(letter) {

            case 'A':
                System.out.println("Letter was A");
                break;

            case 'B':
                System.out.println("Letter was B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("Letter was C, D, or E");
                break;

            default:
                System.out.println("Not found");
        }

        String month = "JuNe";
	    switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
        }

        printDayOfTheWeek(4);
	    printNumberInWord(3);
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        getDaysInMonth(2, 2020);
    }


    // Day of the Week Challenge
    // Write a method with the name 'printDayOfTheWeek' that has one parameter
    // of type 'int' and name it 'day'.

    // The method should not return any value (hint: void)

    // Using a switch statement print "Saturday", "Monday",...,"Saturday" if
    // the int parameter "day" is 0, 1,..., 6 respectively, otherwise it
    // should print "Invalid day".

    public static void printDayOfTheWeek(int day) {
        switch(day) {

            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Day not found");
        }
    }

    // Number In Word
    // Write a method called 'printNumberInWord'. The method has 'one parameter number'
    // which is the whole number. The method needs to print "ZERO", "ONE", "TWO",... "NINE",
    // "OTHER" if the int parameter number is 0, 1, 2,... 9 or 'other' for any
    // other number including negative numbers. You can use if-else statement
    // or switch statement whatever is easier for you.

    public static void printNumberInWord(int wholeNumber) {
        switch(wholeNumber) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    // Number of Days In Month Challenge
    // Write a method 'isLeapYear' with a parameter of type int named 'year'
    // The parameter needs to be 'greater than or equal to 1' and 'less than
    // or equal to 9999'.
    // If the parameter is not in that range return 'false'.
    // Otherwise, if it is in the valid range, calculate if the year is a leap
    // year and return 'true' if it is, otherwise return 'false'

    public static boolean isLeapYear(int year) {
        if((year <= 1) || (year >= 9999)) {
            return false;
        }
        if(year % 4 == 0 && year % 100 != 0) {
            return false;
        }
        if(year % 400 != 0) {
            return false;
        }
        return true;
    }

    // Write another method 'getDaysInMonth' with two parameters 'month'
    // and 'year'.Both of type 'int'.
    // If parameter month is < 1 or > 12 return -1.
    // If parameter year is < 1 or > 9999 then return -1.
    // This method needs to return the number of days in the month. Be careful
    // about leap years they have 29 days in month 2 (February).

    public static int getDaysInMonth(int month, int year) {
        if((month < 1) || (month > 12)) {
            return -1;
        }
        if((year < 1) || (year > 9999)) {
            return -1;
        }

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println(31);
                break;
            case 4: case 6: case 9: case 11:
                System.out.println(30);
                break;
            case 2:
                if(isLeapYear(year)) {
                    System.out.println(29);
                } else System.out.println(28);
                break;
            default :
                System.out.println(-1);
                break;
        }
        return month;
    }
}
