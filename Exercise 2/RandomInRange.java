import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class RandomInRange{
    public static void main (String [] args){
    
    System.out.println("Input two numbers");
    //initialize variable min and max
    //the int will be change in the RandomInRange constructor
    int min = 0;
    int max = 0;
    //calling the constructor
    new RandomInRange(min, max);
    }
    
    //create a constructor with variable int num1 and num2
    public RandomInRange(int min, int max)
    {
        //calling the scanner for the user to give input
        Scanner in = new Scanner (System.in);
        
        System.out.print("first number: ");
        //user enter the minimum number
        min = in.nextInt();
        System.out.print("second number: ");
        //user enter the maximum number
        max = in.nextInt();
        
        //if min is more than max, it will print zero.
        if(min>max)
            System.out.println("0");
        else
        {
            //initialize randomNum as the random number will be produced based
            //on the range from the min and max
            int randomNum = ThreadLocalRandom.current().nextInt(min, max);
            System.out.print("The random range between " + min + " and " + max + " is " + randomNum);
        }
    }
    
}