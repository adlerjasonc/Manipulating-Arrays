import java.util.Arrays;

/**
 * 
 * CSCI 230
 * Dr. McCauley
 * HW1
 * 1/17/19
 * @author Jason Adler
 * The class BinarySearch contains three different methods for 
 * the binary search.  Typical, alternative, and recursive.
 *
 * This work is entirely my own.  I worked with TA Luis for help.
 * The goal of BinarySearch class is to use three different methods for 
 * finding a search value in a sorted array.
 */
public class BinarySearch {
		
	/*
	 * binary_search_typical method
	 * @param a - the array passed in to search, key - number being searched for in array
	 * @return middle value - if key is found or -1 - if key is not found
	 */
	
	public static int binary_search_typical ( int a [], int key )
	{
		
		int left = 0;
		int right = a.length-1;
		
		while ( left <= right )
		{
			int middle =  (int) (Math.floor ( (left + right) / (2.0) ));
			if ( a[middle] < key )
			{
				left = middle + 1;
			}
			else if ( a[middle] > key )
			{
				right = middle - 1;
			}
			else
			{
				return middle;
			}
		}
			return -1;
	}
				
	/*
	 * binary_search_alternative method
	 * @param a - the array passed in to search, key - number being searched for in array
	 * @return middle value - if key is found or -1 - if key is not found
	 */
	
	public static int binary_search_alternative ( int a [], int key )
	{
		
		int left = 0;
		int right = (a.length-1);
			    
		while ( left != right )
		{
			int middle =   (int) (Math.ceil ( (left + right) / (2.0) ));
			if ( a[middle] > key )
			{
				right = middle-1;
				
			}
			else
			{
			left = middle;
			}
		}
			
			if ( a[left] == key )
			{
			return left;
			}
			else	
			return -1;
						
	}
		
	/*
	 * binary_search_recursive method
	 * @param a - the array passed in to search, size - the size of the array (last-first), key - number being searched for in array
	 * @return middle value - if key is found or -1 - if key is not found
	 */
	
	public static int binary_search_recursive ( int a [], int size, int key )
	{
	
		
		return binary_search(a, key, (size-size), (size-1));
				
	}
	
	/*
	 * binary_search method
	 * @param a - the array passed in to search, key - number being searched for in array, left and right indices of array
	 * @return middle value - if key is found or -1 - if key is not found and pass back to previous recursive method
	 */
	
	private static int binary_search( int a [], int key, int left, int right )
	{
	
		if ( left <= right )
		{
			int middle = (left + right) / 2;
			if ( a[middle] < key )
			{
				left = middle + 1;
				return binary_search(a, key, left, right );
			}
			else if ( a[middle] > key )
			{
				right = middle - 1;
				return binary_search(a, key, left, right );
			}
			else
			{
				return middle;
			}
		}
			return -1;
	}
	
	/*
	 * main method
	 * used for testing the above binary search methods
	 */
	
	public static void main (String args[])
	{
		int size = 10000;
		
		int[] a = new int [size];
		//int[] a = {0,3,4,4,5,7,8,9,9,9};
		for ( int i = 0; i <a.length; i++ )
		{
			a[i] = (int)(Math.random()*100);
	}
		
		System.out.println();
		Arrays.sort(a);
		
		/*for ( int i = 0; i <a.length; i++ )
		{
			System.out.print(a[i]);
			System.out.println();
		}*/
		System.out.println();
		
		
		System.out.println("Looking for a number with typical.");
		System.out.println(binary_search_typical(a, 0));
		System.out.println("Looking for a number with typical.");
		System.out.println(binary_search_typical(a, 11));
		
		System.out.println();
		System.out.println("Looking for a number with alternative.");
		System.out.println(binary_search_alternative(a, 0));
		System.out.println("Looking for a number with alternative.");
		System.out.println(binary_search_alternative(a, 11));
	
		System.out.println();
		System.out.println("Looking for a number with recursion.");
		System.out.println(binary_search_recursive(a, (a.length), 0));
		System.out.println("Looking for a number with recursion.");
		System.out.println(binary_search_recursive(a, (a.length), 9));
		
	
	
	}
}
