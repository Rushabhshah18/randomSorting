import java.util.Scanner;

import tutorProject.*;

public class index extends arrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRandoms r=new getRandoms();
		arrayMethod s=new arrayMethod();
		index in = new index();
		Scanner input = new Scanner(System.in);
		//int size = input.nextInt();
		int[] a = new int[(int) (Math.random()*999)];
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*999);
					//input.nextInt();
		}
		s.sortArray(a);
		s.arrayMethod(a);
		//r.sortArray(a);
	}

}
