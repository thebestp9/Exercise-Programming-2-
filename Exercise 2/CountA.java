import java.util.*;
public class CountA{
    public static void main (String [] args){
    
    String sen = "";
    int count = 0;
    System.out.println("Enter any words that will calculate char 'A'");
    new CountA(sen, count);
    }
    
    //create a constructor to calculate the char 'A'
    public CountA(String sen, int count)
    {
        Scanner in = new Scanner(System.in);
        //user input a String
        sen = in.nextLine();
        //for loop to check the number of word in the string
        for (int i = 0; i<sen.length(); i++)
            //calculate the char 'A' in the String one by one
            if(sen.charAt(i) == 'A')
                count++;
        //print variable count
        System.out.println(count);
    }
}