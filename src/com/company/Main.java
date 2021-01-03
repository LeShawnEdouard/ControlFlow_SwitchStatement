package com.company;

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

            case 'C':
                System.out.println("Letter was C");
                break;

            case 'D':
                System.out.println("Letter was D");
                break;

            case 'E':
                System.out.println("Letter was E");
                break;

            default:
                System.out.println("Not found");
        }
    }
}
