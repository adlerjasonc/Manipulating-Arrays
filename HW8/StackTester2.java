
/**
 * Write a description of class StackTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class StackTester2 // doesn't extend
{
    
    public static void main(String[] args) {
        
    //List<E> stack;
    
    Stack2<Integer> first = new Stack2<Integer>();
    
    Stack2<String> second = new Stack2<String>();
    
    Stack2<Character> third = new Stack2<Character>();
    
    
    //testing first
    System.out.println(first);
    if ( first.isEmpty() == true )
    System.out.println("First is empty");
    else 
    System.out.println("First is not empty");
    first.push(1);
    System.out.println(first);
    first.push(2);
    first.push(3);
    System.out.println("Before top " + first);
    
    try 
    {
        System.out.println( first.top() );
        
    }
    
    catch (StackEmptyException exception)
    {
       System.out.println("Sorry, the stack was empty"); 
    } 
    
    first.push(4);
    first.push(5);
    System.out.println("Before pop " + first);
    
    
    try 
    {
        System.out.println( first.pop() );
        
    }
    
    catch (StackEmptyException exception)
    {
       System.out.println("Sorry, the stack was empty"); 
    } 
    
   
  
    
    if ( first.isEmpty() == true )
    System.out.println("First is empty");
    else 
    System.out.println("First is not empty");
    
    System.out.println();
    System.out.println();
   
    //testing second
    System.out.println(second);
    if ( second.isEmpty() == true )
    System.out.println("second is empty");
    else 
    System.out.println("second is not empty");
    second.push("dog");
    System.out.println(second);
    second.push("cat");
    second.push("fish");
    System.out.println("Before top " + second);
    
    try
    {
    System.out.println( second.top() );
    }

    catch (StackEmptyException exception)
    {
     System.out.println("Sorry the stack is empty.");
    }
    
    second.push("blue");
    second.push("green");
    System.out.println("Before pop " + second);
    
    
    try
    {
        second.pop();
    }
    catch (StackEmptyException exception)
    {
        System.out.println("Sorry, the stack was empty");
    }
    
    System.out.println("After pop " + second);
    System.out.println("Before top " + second);
   
    if ( second.isEmpty() == true )
    System.out.println("second is empty");
    else 
    System.out.println("second is not empty");
    
    System.out.println();
    System.out.println();
   
    //testing second
    System.out.println(third);
    if ( third.isEmpty() == true )
    System.out.println("third is empty");
    else 
    System.out.println("third is not empty");
    third.push('a');
    System.out.println(third);
    third.push('b');
    third.push('c');
    System.out.println("Before top " + third);
    
    try 
    {
        System.out.println( third.top() );
    }
    catch (StackEmptyException exception)
    {
        System.out.println("Sorry, the stack was empty");
    }
    
    third.push('d');
    third.push('e');
    System.out.println("Before pop " + third);
    
    try
    {
        third.pop();
    }
    catch (StackEmptyException exception)
    {
        System.out.println("Sorry, the stack was empty.");
    }
    
    System.out.println("After pop " + third);
  
    if ( third.isEmpty() == true )
    System.out.println("third is empty");
    else 
    System.out.println("third is not empty");
  
    
    //clear out all three testers from original test class
    
    System.out.println("\n\nPrinting first list with values " + first);
    
    while (!first.isEmpty())
    {
    try 
    {
        first.pop();
    }
    catch (StackEmptyException exception)
    {
        System.out.println("Sorry, the stack was empty");
    }
}
    System.out.println("Printing with no values");
    System.out.println(first);
    if ( first.isEmpty())
    System.out.println("First is empty");
    else
    System.out.println("First is not empty");
    System.out.println();
    try
    {
    first.pop();
}
catch (StackEmptyException exception)
{
    System.out.println("Sorry, stack empty.");
}
}
}
