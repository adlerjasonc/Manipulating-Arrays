
/**
 * Write a description of class StackEmptyException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StackEmptyException extends Exception
{
 
    public StackEmptyException()
    {
       
    }

    //override to string
    @Override
    public String toString()
    {
        return ("Sorry, the stack is empty (overridden toString method)");
    }
    
    //get message
    @Override
    public String getMessage()
    {
        return ("Sorry, the stack is empty (overridden getMessage method)");
    }
    
    //override get localized message
    @Override
    public String getLocalizedMessage()
    {
        return ("Sorry, the stack is empty (overridden getLocalizedMethod method)");
    }
}
