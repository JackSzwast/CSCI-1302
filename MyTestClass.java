//+++++++++++++++++++++++++++
//Name: Jack Szwast 
//Course:CSCI 1302
//Instructor: Dr. Sartoli
//Purpose: Serve as a driver
//Date: 10/15/19
//+++++++++++++++++++++++++++

import java.util.Scanner;
public class MyTestClass {

	
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
		String string1;
		String searchkey;
		
		
		String[] list = new String[5];
		
		System.out.println("Please enter five string values");
		
		
		for(int i =0; i <= 4; i++)
		{
			string1 = scan.next();
			list [i]= new String (string1);
		}
		
		
		
		System.out.println("Enter Search Key");
		searchkey=scan.next();
		System.out.println("Enter Search key:"+" "+ searchkey);
		
		
		
		Sorting<String> sorts = new Sorting<String>();
		
		
		System.out.print("Using Selection Sort to Sort Strings in Ascending Order");
		System.out.println();
		sorts.reverseselectionSort(list);
		for(int i = 0; i < list.length;i++)
		System.out.print(list[i]+", ");
		
		
		
		
		System.out.println();
		System.out.println("Using Selection Sort to Sort Strings in Descending Order");
		sorts.selectionSort(list);
		for(int i = 0; i < list.length;i++)
		System.out.print(list[i]+", ");
		
		
		
		
		System.out.println();
		System.out.println("Using Insertion Sort to Sort Strings in Ascending Order");
	    sorts.reverseinsertionSort(list);
	    for(int i = 0; i < list.length;i++)
		System.out.print(list[i]+", ");
		
	    
	    
	    System.out.println();
	    System.out.println("Using Insertion Sort to Sort Strings in Descending Order");
	    sorts.insertionSort(list);
	    for(int i = 0; i < list.length;i++)
		System.out.print(list[i]+", ");
	    
	    
	    
	    System.out.println();
	    System.out.println();
	    
	    
	    
	   
	    System.out.println("Using Linear search to search for key:" );
        Searching<String> searches = new Searching<String>();
        int index; 
        index = searches.linearSearch(list, searchkey);
        System.out.println("Item found at"+" "+index);
	    
        
        System.out.println();
        
	    
        System.out.println("Using Binary search to search for key:" );
        int index2;
	    index =searches.binarySearch(list, searchkey);
	    System.out.println("Item found at"+" "+index);
	    
	    
	    
	    
	    
		
	    
		
	}

}
