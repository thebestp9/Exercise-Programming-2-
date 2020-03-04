import java.util.*;
public class PrintReverse{
    public static void main (String [] args){
   
        String word = "";
        System.out.println("Enter any words");
        //call the constructor
        new PrintReverse(word);
    }
    
    //create a constructor to read a String in reverse
    public PrintReverse(String word)
    {
        Scanner in = new Scanner(System.in);
        //user input a String
        word = in.nextLine();
        for (int i = word.length() - 1; i>=0; i--)
            System.out.print(word.charAt(i));
            
    }
    
    
}