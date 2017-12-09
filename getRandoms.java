

import java.util.Scanner;

public class getRandoms {
	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		//int size = input.nextInt();
		int[] a = new int[(int) (Math.random()*999)];
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*999);
					//input.nextInt();
		}
		arrayMethod(a);
		sortArray(a);
	}

	public static void sortArray(int[] a) {
		// TODO Auto-generated method stub
		int[] b=new int[a.length];
		//int min=a[0];
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				temp=0;
				b[j]=a[j];
				//System.out.print(" "+a[j]);
				
			}
			/*System.out.println(" ");
			System.out.println(a[i]);*/
		}
		System.out.println(" ");
		for(int i=0;i<b.length;i++) {
			System.out.print(" "+b[i]);
					
		}
	}

	public static void arrayMethod(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		int min=a[0],max=a[0];
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
