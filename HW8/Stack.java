/**
 * Jason Adler
 * Dr. McCauley
 * 11.15.18
 * This work is entirely my own.
 */
import java.util.*;
public class Stack<E> implements StackInterface<E>
{
    List<E> stack;
    
    //use location 0 or length rather than new int top
    public Stack(){
        stack = new LinkedList<E>();
        
    }

    public String toString(){     // LinkedList has a toString method
        return stack.toString();  // inherited from AbstractCollection
                      
    }
    
    public E top( )
    {
      if ( stack.size() == 0 )
      return null;
      else
      return stack.get(stack.size()-1);  
    }
    
    public E pop()
    {
      if ( stack.size() == 0 )
      return null;
      else      
      return stack.remove((stack.size()-1));
    }
    
    public void push(E e)
    {
      stack.add(e);
      //currently going to back, needs to be adjusted to top if using top
    }
     
    public boolean isEmpty( ) 
    {
      
      if ( stack.size() == 0 )
      return true; 
      else
      return false;
    }
       
}
