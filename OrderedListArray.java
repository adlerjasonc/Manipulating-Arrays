
/**
 * Jason Adler
 * HW 5 
 * Dr. McCauley CSCI 221
 * This work is entirely my own.
 */



 /**
  * Constructor for objects of class HW5
  */
public class OrderedListArray
{
    // instance variables
    private static int size;
    private static int [] array = new int [5];
    
 

    /**
     * return number of elements stored in the list
     * precondition - none
     */
    public static int size()
    {
        int i = 0;
        int numElements = 0;
        for ( i = 0; i < array.length; ++i)
        {
           if (array[i] != 0)
           {
            numElements += 1;
           }
        }
        return numElements;
    }
    
    /**
     * insert integer a in proper position in the list
     * precondition - list is in order
     * postcondition - none
     */
    public static void insert( int a )
    {
       int i = 0;
       while (i < array.length)
       {
           if (array[i] == 0)
           {
               array[i] = a;
               break;
           }
           else
           {
               i++;
           }
           
        }
        OrderedListArray.bubbleSort();
    }    
    
     /**
     * returns index of a in list or -1 if not in list
     * precondition - list is in order
     * postcondition - none
     */
    
    public static int find( int a )
    {
      int i = 0;
      for ( i = 0; i < array.length; ++i)
      {
          if (array[i] == a)
          {
              return i;
          }
            
      }   
      return -1; 
    }  
    
     /**
     * removes integer at location if valid, if not, does nothing
     * precondition - list is in order with empty spaces at the end
     * postcondition - list is ordered with empty spaces at the end, size variable updated
     */
    public static void delete( int location )
    {
       OrderedListArray.find(location);
       if (location != -1)
       {
          array[location] = 0;
       }
       OrderedListArray.bubbleSort();
       
    }  
    
     /**
     * prints contents of OrderedListArray, prints null if no value stored
     * precondition - list is in order
     * postcondition - none
     */
    public static void displayList()
    {
        int i;
        System.out.println("OrderedListArray: capacity "+array.length+", size "+OrderedListArray.size());
        for ( i = 0; i < array.length; ++i ) 
        {
            if (array[i] != 0)
            {
             System.out.println("["+i+"] "+ array[i]);
            }    
            else
            {
             System.out.println("["+i+"] null");
            }
                     
        }    
    }  
    
     /**
     * return array that is deep copy of array, doesn't change contents of data in array
     * precondition - none
     * postcondition - none
     */
    public static int [] toArray()
    {
        int [] arrayCopy = new int [array.length];
        arrayCopy = array;
        
        int i = 0;
        for ( i = 0; i < arrayCopy.length; ++i )
        {
         System.out.println(arrayCopy[i]);
        }
        return arrayCopy;
    }  
    
     /**
     * doubles capacity of list, calle dby insert method when user inserts element into full list
     * precondition - list is in order
     * postcondition - instance variables modified, list still ordered
     */
    public static void enlarge()
    { 
      int [] array = new int [(OrderedListArray.array.length*2)];
    
    }  
    
    public static void bubbleSort()
    {
       int i = 0;
       int swap = 0;
       for ( i = 0; i < array.length-1; ++i )
       {
          for ( int j = 1; j < array.length; ++j )
          {
              if (array[j] != 0) 
              {
                  if (array[j-1] > array[j])
                  {
                  swap = array[j];
                  array[j] = array[j-1]; 
                  array[j-1] = swap;
                  }
                 
              }
              
          }
         
       }
    }
    
    /*
     * The code below is for my personal testing to check the methods.  I have comented it out.
     */
    public static void main(String[] args)
    {
      OrderedListArray.insert(5);
      OrderedListArray.displayList();
      System.out.println("Total array size is: "+OrderedListArray.size());
      System.out.println();
      OrderedListArray.insert(4);
      OrderedListArray.displayList();
      System.out.println("Total array size is: "+OrderedListArray.size());
      System.out.println();
      OrderedListArray.insert(3);
      OrderedListArray.displayList();
      System.out.println("Total array size is: "+OrderedListArray.size());
      System.out.println();
      OrderedListArray.insert(2);
      OrderedListArray.displayList();
      System.out.println("Total array size is: "+OrderedListArray.size());
      System.out.println();
      OrderedListArray.delete(2);
      OrderedListArray.displayList();
      System.out.println("Total array size is: "+OrderedListArray.size());
      System.out.println();
      System.out.println("Array search for 5,found at array location "+OrderedListArray.find(5));
      System.out.println("Array search for 9,found at "+OrderedListArray.find(9));
      System.out.println();
      OrderedListArray.insert(2);
      OrderedListArray.displayList();
      OrderedListArray.toArray();
      OrderedListArray.enlarge();
      OrderedListArray.delete(2);
      OrderedListArray.displayList();
      
    }
}//end class OrderedListArray
