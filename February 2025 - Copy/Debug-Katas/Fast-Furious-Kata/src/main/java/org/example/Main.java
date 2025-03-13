package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Expected: 40 - Actual: " + cost(90));
        System.out.println("Expected: 30 - Actual: " + cost(5));
        System.out.println("Expected: 50 - Actual: " + cost(102));
    }


    //https://www.codewars.com/kata/589b1c15081bcbfe6700017a/train/java

        public static int cost(int mins){

            // create a variable hour
            // set equal to mins - 60
            // if hour < 0
                // return 30

            // create a variable for halfHours
            // set equal to hours / 30 --how many half hour blocks
            // return 30 + halfHours * 10

            int leftovermins = mins - 60;

            if(leftovermins < 0){
                return 30;
            }

            //5 min grace period

            leftovermins -= 5;

            int halfHours = leftovermins / 30;
            //what is the remainder?
            if(leftovermins % 30 > 0){
                halfHours++; // as long as there is time not on the full hour, add a halfhour increment
            }
            return 30 + (halfHours * 10);



            //solution
        }
    }
