import java. util. Collection;

/**
 * 
 * CSCI 230
 * Dr. McCauley
 * HW6
 * Spring 2019
 * 3/1/19
 * @author Jason Adler
 * The class HW6 contains just a swap, sort, and remove duplicate methods
 *  that will extend the comparable class and doublylinkedlist 
 * in order to perform operations on the list of objects
 *
 * This work is entirely my own.  I worked with TA Luis for help.
 */


public class SelfSortingListHW6<E extends Comparable<? super E>> extends DoublyLinkedList<E>{
    // SelfSorting lists will only store Comparables - objects that can be compared by the 
	// compareTo method
	/**
	 * constructor
	 */
	public SelfSortingListHW6() 
	{
		super();
	}
	/**
	 * swap the contents of two given links
	 * @param one
	 * @param two
	 */
	private void swap(Link<E> one, Link<E> two) 
	{
		//Link<E> copy = two.next();
		//two.setPrev(one.prev());
		//two.setNext(one);
		//one.setPrev(two);
		//one.setNext(copy);
		
		E copy = two.element();
		two.setElement(one.element());
		one.setElement(copy);
		
		
	}
	
	/**
	 * mimics an insertion sort - no arrays can be used
	 */
	public void sort() 
	{
			if ( listSize > 1) 
			{
				Link<E> one = head.next();
				Link<E> linkToFix = head.next().next();
						
				Link<E> walker = linkToFix;
				while ( walker != tail )
				{
					//System.out.println("First while");
					while ( walker != one && ( walker.element().compareTo( walker.prev().element()) < 0) )
					{
						//System.out.println("Second while");
						//Link<E> copy = walker.prev();
						//System.out.println("Heres the this : " + this);
						swap( walker, walker.prev() );
						//System.out.println("Heres after: " + this);
						walker = walker.prev();
						//System.out.println("walkers value " + walker + " walker prev value: " + walker.prev() );
					}
				
					linkToFix = linkToFix.next();
					walker = linkToFix;
				
				}
				//System.out.println("Out of the whiles");
			}
			else return;
	}
	/**
	 * remove duplicate items from list
	 */
	public void removeDuplicates() 
	{
		//DoublyLinkedList<E> a = new DoublyLinkedList<E>();
		curr = head.next();
		Link<E> walker = curr.next();
	    while ( curr != tail.prev() && walker != tail )
		{
	
	    		if ( curr.element().compareTo( walker.element() ) == 0 )
	    		{
	    			//System.out.println(walker.element() + " is a duplicate ");
	    			//System.out.print(walker.element() + ", ");
	    			//System.out.println(this);
	    			walker.setPrev(curr);
	    	    	walker.setNext(curr.next().next());
	    			//System.out.println(this);
	    			
	    			walker = walker.next();
	    			
	    		}
	       	
	    	walker = curr.next();
	    //	System.out.println();
	    	curr = curr.next();
	    	
		}
	
	}
	
	
	/**
	 * This main begins to test your code
	 */
	public static void main(String[] args) 
	{
		SelfSortingListHW6<Integer> s = new SelfSortingListHW6<>();
		s.append(12);
		s.append(330);
		s.append(4);
		s.append(12);
		s.append(330);
		s.append(-14);
		s.append(4);
		s.append(4);
		s.append(330);
		s.append(-14);
		System.out.println(s);
		// Output of above line should be: 12, 330, 4, 12, 330, -14, 4, 4, 330, -14
		s.sort();
	    System.out.println(s);	
		// Output of above line should be: -14, -14, 4, 4, 4, 12, 12, 330, 330, 330
		s.removeDuplicates();
		System.out.println(s);
		// Output of above line should be: -14, 4, 12, 330


	}
	
}
