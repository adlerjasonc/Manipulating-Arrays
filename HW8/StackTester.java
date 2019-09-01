
/**
 * Jason Adler
 * Dr. McCauley
 * 11.15.18
 * This work is entirely my own.
 */
import java.util.*;
public class StackTester // doesn't extend
{
    
    public static void main(String[] args) {
        
    //List<E> stack;
    
    Stack<Integer> first = new Stack<Integer>();
    
    Stack<String> second = new Stack<String>();
    
    Stack<Character> third = new Stack<Character>();
    
    
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
    System.out.println( first.top() );
    first.push(4);
    first.push(5);
    System.out.println("Before pop " + first);
    first.pop();
    System.out.println("After pop " + first);
    System.out.println("Before top " + first);
    System.out.println( "after top " + first.top() );
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
    System.out.println( second.top() );
    second.push("blue");
    second.push("green");
    System.out.println("Before pop " + second);
    second.pop();
    System.out.println("After pop " + second);
    System.out.println("Before top " + second);
    System.out.println( "after top " + second.top() );
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
    System.out.println( third.top() );
    third.push('d');
    third.push('e');
    System.out.println("Before pop " + third);
    third.pop();
    System.out.println("After pop " + third);
    System.out.println("Before top " + third);
    System.out.println( "after top " + third.top() );
    if ( third.isEmpty() == true )
    System.out.println("third is empty");
    else 
    System.out.println("third is not empty");
  
}
}
