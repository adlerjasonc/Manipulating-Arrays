
/**
 * Write a description of class Stack2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Stack2<E> implements StackInterface2<E>

{
    List<E> stack;
    
    //use location 0 or length rather than new int top
    public Stack2(){
        stack = new LinkedList<E>();
        
    }

    public String toString(){     // LinkedList has a toString method
        return stack.toString();  // inherited from AbstractCollection
                      
    }
    
    public E top( ) throws StackEmptyException
    {
      if ( stack.size() == 0 )
        throw new StackEmptyException();
      
      else
      return stack.get(stack.size()-1);  
    }
    
    public E pop() throws StackEmptyException
    {
      if ( stack.size() == 0 )
        throw new StackEmptyException();
      
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

