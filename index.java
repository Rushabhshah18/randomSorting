import java.util.Scanner;

import tutorProject.*;

public class index extends arrayMethod {

	public static void main(String[] args) {
		// Generating random values and passing it to methids
		
		// creating the object of the other class
		arrayMethod s=new arrayMethod();
		
		// Creating a Scanner object
		Scanner input = new Scanner(System.in);

		//Generating random values
		int[] a = new int[(int) (Math.random()*999)];
		
		// printing the length of the array
		System.out.println("Size of the array is:"+a.length);
		for (int i = 0; i < a.length; i++) {
			//Storing values in integer array
			a[i] = (int)(Math.random()*999);
					//input.nextInt();
		}
			
		//to sort the array 
		s.sortArray(a);
		
		//to find the minimum and maximum of the array
		s.minmax(a);
		
	}

}
