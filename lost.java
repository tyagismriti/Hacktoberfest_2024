// Java program to find the lost count 

import java.util.*; 
public class GFG { 

	// find lost count 
	public static void findLostCount(String s) 
	{ 

		// counting the number of elements using the split 
		// function -1 
		int count = s.split(" ").length - 1; 

		// if the value count is present then print count 
		// else print -1 
		if (s.indexOf(Integer.toString(count)) != -1) 
			System.out.println("Number of elements "
							+ count); 
		else
			System.out.println(-1); 
	} 

	public static void main(String args[]) 
	{ 
		Scanner in = new Scanner(System.in); 

		// Taking input as string 
		String s = "5 7 4 3 2 6"; 

		findLostCount(s); 
	} 
}
