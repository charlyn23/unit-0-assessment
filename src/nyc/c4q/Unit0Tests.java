package nyc.c4q;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unit0Tests {

    /*
     * Name of the method implies what the method should do.
     * Some of these methods require that the method return signature change.
     * For example, `returnPrimitiveBooleanTrue()` should return `boolean`, not `Object`.
     */
    public static void main (String args[]) {
      // Use main to test your methods
        printSumOf1Upto10UsingForLoop();
      printHelloWorld();


        //System.out.println(isOdd(8));
       /// System.out.println(isMultipleOfThree(3));
        //System.out.println(isOddAndIsMultipleOfThree(6));
        //System.out.println(repeatStringXTimes("Hello", 1));
        //System.out.println(declareAndReturnPersonNamedAda());
        //System.out.println(declareAndReturnPersonNamedAlanTuringFromLondon());
    }

    public static void printHelloWorld() {
      System.out.println("Hello World");
    }

    public static boolean returnPrimitiveBooleanTrue() {
      return true;
    }

    public static int returnPrimitiveInt1729() {
      return 1729;
    }

    public static double returnPrimitiveDoubleThreePointOneFour() {
      return 3.14;
    }

    public static char returnPrimitiveCharZ() {
        return 'Z';
    }

    public static void printSumOf1Upto10UsingForLoop() {
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            sum += i;
            System.out.println(sum);
        }

    }

    public static void printSumOf1Upto10000UsingForLoop() {
        int sum = 0;
        for (int i =0; i < 1000; i++) {
            sum += 1;
            System.out.println(sum);
        }
    }

    public static boolean isOdd(int n)
    {
        //boolean isOdd = true;
        if(n % 2 != 0)
        return true;
        else {
            return false;
        }
    }

    public static boolean isMultipleOfThree(int n) {
      if(n % 3 == 0)
          return true;
        else{
          return false;
      }
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
      if ((n % 2 !=0) && (n % 3 == 0))
        return true;
            else {
                return false;
            }
    }

    public static String repeatStringXTimes(String input, int times) {
        // Given string "input" and a positive integer "times",
        // return a string that is equal to the input string repeated X times.
        // If "times" is 0 negative, return a blank string.
        // For example, repeatStringXTimes("potato", 5) should return "potatopotatopotatopotatopotato".
        for (int i = 0; i < times; i++){
            System.out.print(input);
        } if (times < 0){
            return "";
        }


        return "";
    }

    public static String returnStringUntilQ(String input) {
        // Given string "input", return a string that stops at the first occurrence of the character 'q'.
        // For example, given the string "ubiquitous", return "ubi".
        // If the string does not contain a q, then return the empty string "".


        return "";
    }

    public static Person declareAndReturnPersonNamedAda() {
        Person ada = new Person("Ada");
        ada.setName("Ada");
        ada.getName();
        return ada;
    }



    public static Person declareAndReturnPersonNamedAlanTuringFromLondon() {
      Person alan = new Person("Alan Turing");
        alan.setName("Alan Turing");
        alan.setCity("London");
        return alan;
    }

    public static boolean isFromLondon(Person person) {
      return false;
    }

    public static ArrayList<Place> declareAndReturnArrayListOfThreePlaces() {
        return null;
    }

    public static HashMap<String, Person> declareAndReturnHashmapOfAlanTuringAndGraceHopper() {
      // The HashMap should have key-value pairs of:
      // - key: `Alan Turing`, value: instance of Person with name `Alan Turing`
      // - key: `Grace Hopper`, value: instance of Person with name `Grace Hopper`
      return null;
    }

    public static void changeTuringsCityToPrinceton(HashMap<String, Person> people) {
    }

    // Bonus Problems
    public static void bonusPrintOutSumOfFirstTenFibonacciNumbers() {

    }

    public static void bonusPrintOutSumOfFirstFortyFibonacciNumbers() {

    }
}
