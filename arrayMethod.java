

public class arrayMethod {
	public static void sortArray(int[] a) {
		// Using this method to sort the array
		
		// Creating the array with same size as the parametrized array
		int[] b=new int[a.length];
		
		//initializing a swap variable
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					//Swapping values
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				temp=0;
				b[j]=a[j];
			}
		}
	}
	public static void minmax(int[] a) {
		// finding minimum and maximum from random array
		
		//initializing sum , min and max array
		int sum=0,min=a[0],max=a[0];;
		
		//finding min and max
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			if(min>a[i]) {
				min=a[i];
			}
			if(max < a[i]) {
				max=a[i]; 
			}
		}
		System.out.println("Minimum:"+min+" Maximum:"+max+" Sum:"+sum);
	}
}
