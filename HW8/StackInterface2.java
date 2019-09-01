






public interface StackInterface2<E>
{
    
    // remove and return the item on top
    public E top( ) throws StackEmptyException;
    // return a reference to the item on the top of the stack
    public E pop() throws StackEmptyException;
    // add element e to the top of the stack
    public void push(E e);
    // returns true if the stack is empty, returns false otherwise
    public boolean isEmpty( ) ;
    
}