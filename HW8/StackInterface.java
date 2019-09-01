
/**
 * Stack interface
 */
import java.util.*;
public interface StackInterface<E>
{
    
    // remove and return the item on top
    public E top( );
    // return a reference to the item on the top of the stack
    public E pop();
    // add element e to the top of the stack
    public void push(E e);
    // returns true if the stack is empty, returns false otherwise
    public boolean isEmpty( ) ;
    
}
    
