// Java program to implement 
// Random number Game

import java.util.Random;
import java.util.*;

public class RandomNumberGame{

    public static void main(String args[])
    {

    System.out.println("Welcome to random number game!!");

    //generating a random number in range 0-100
    int mynumber = (int)(Math.random()*100);
    
    Scanner input = new Scanner(System.in);
    int usernumber = 0;

    //no of available trails
    int count=10;

    do{
    
        System.out.println("Guess the number(0-100)("+count+" chances left)");

        //takes input of a number from user
        usernumber = input.nextInt();

        //if usernumber matches generated number 
        //then user wins game
        if(usernumber == mynumber)
        {
            System.out.println("WOOHOOO CORRECT NUMBER!\nYOU WON");
            break;
        }


        //if usernumber larger than generated number 
        else if( usernumber > mynumber)
        {
        System.out.println( "Number " +usernumber+ " is larger");
        }


        //if usernumber smaller than generated number 
        else
        {
            System.out.println("Number " +usernumber + " is smaller");
        }

        //decrementing the count
        count--;


    }
    while(usernumber >= 0 && count>0);

    //if user reach maximum number of trails
    if(count == 0)
    {
        System.out.println("YOU LOST!, maximum limit of incorrect guesses reached.");
        System.out.println("NUMBER WAS :" +mynumber);
    }
    

}
}
    


}
