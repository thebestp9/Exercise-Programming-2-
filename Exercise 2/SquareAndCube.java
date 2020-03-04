public class SquareAndCube{
    public static void main (String [] args){
    
    //initialize the variables
    int number = 0, square = 0, cube = 0;
    
    System.out.println("Number\t\t\tSquare\t\t\tCube");
    
    //a loop to print the numbers of square and cube
    //will print until the number 10
    for (int i = 0; i<11; i++)
    {
        //the square and cube variable convert from double to int
        number = i;
        square = (int) Math.pow(i,2);
        cube = (int) Math.pow(i,3);
        
        //the number will be printed 
        System.out.println(number +"\t\t\t\t\t" + square +"\t\t\t\t\t" + cube);
    }
        
    }
}