
/**
 * Write a description of class ArraySortTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;


public class ArraySortTester
{
   private int [] myArray = new int [10];
   
    public ArraySortTester()
    {
        // initialise instance variables
        myArray[0] = 4;
        myArray[1] = 2;
        myArray[2] = 5;
        myArray[3] = 9;
        myArray[4] = 2;
        myArray[5] = 10;
        myArray[6] = 1;
        myArray[7] = 3;
        
        System.out.println("Array printed prior to sorting.\n");
        
        for ( int i = 0; i < myArray.length; ++i )
        {
        System.out.println(myArray[i]);
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("Array printed after sorting.\n");
        Arrays.sort(myArray);
        
        for ( int i = 0; i < myArray.length; ++i )
        {
        System.out.println(myArray[i]);
        }
        
        System.out.println();
        System.out.println("Now sending out of bounds parameters to sort method.");
        
        try
        {
        Arrays.sort( myArray, -1, 9 );
           
        }
       
        catch(ArrayIndexOutOfBoundsException obexception)
        {
         System.out.println("Oops, " + obexception);
        }
        
        System.out.println();
         
        System.out.println("Now sending illegal argument parameters to sort method.");
       
        try
        {
        Arrays.sort( myArray, 5, 4 );
           
        }
       
        catch(IllegalArgumentException obexception)
        {
         System.out.println("Sorry, " + obexception);
        }
        
        System.out.println();
        
        System.out.println("Now sending acceptable parameters to sort method.");
        try
        {
        Arrays.sort( myArray, 4, 5 );
        System.out.println("Print statement inside of try, catch not hit.");  
        }
       
        catch(Exception obexception)
        {
         System.out.println("\nSorry, " + obexception);
        }
        
       
     
     
        
    }
     
 
 
}
