import java.util.Scanner;

/*
 * Shaun Mbateng
 * Max Slice Sum
 * This program finds that max possible sum of any
 * 		2 slices of a given array of integers.
 * It has a time complexity of O(N).
 */

public class MaxDoubleSliceSum 
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in); //For Inputs
		int len; //Length of Array
		int [] arr; //Array of Integers
		int dblSum; //Max Double Slice Sum
		Slice Values = new Slice(); //Class With Function that Finds Max Slice
		
		//Enter and Set Array Length
		System.out.print("Enter the Number of Integers: ");
		len = cin.nextInt();
		arr = new int [len];
		System.out.println();
		
		//Fill Arrays
		for (int i=0; i<len; i++)
		{
			System.out.print("Enter Integer Value "+(i+1)+": ");
			arr[i] = cin.nextInt();
		}
		
		cin.close(); //No More Inputs Needed
		dblSum = Values.getDoubleMaxSum(arr); //Get Max Sum for Double Slice
		System.out.println(); //Print Line Space
		
		//Print Results
		System.out.println("The maximum possible double slice sum is "+dblSum+".");
	}
}