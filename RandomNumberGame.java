 import java.util.Random;
import java.util.*;

public class RandomNumberGame{

    public static void main(String args[])
    {

    System.out.println("Welcome to random number game!!");
    int mynumber = (int)(Math.random()*100);
    Scanner input = new Scanner(System.in);
    int usernumber = 0;
    int count=10;

    do{
        System.out.println("Guess the number(0-100)("+count+" chances left)");
        usernumber = input.nextInt();

        if(usernumber == mynumber)
        {
            System.out.println("WOOHOOO CORRECT NUMBER!\nYOU WON");
            break;
        }


        else if( usernumber > mynumber)
        {
        System.out.println( mynumber + "is larger");
        }


        else
        {
            System.out.println( mynumber + "is smaller");
        }
        count--;


    }
    while(usernumber >= 0 && count>0);
    if(count == 0)
    {
        System.out.println("YOU LOST!, maximum limit of incorrect guesses reached.");
        System.out.println("NUMBER WAS :" +mynumber);
    }
    

}
    


}
