package lecture2;

import java.util.Scanner;

public class LargestOf3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a");
		int a = scn.nextInt();
		
		System.out.println("Enter b");
		int b = scn.nextInt();
		
		System.out.println("Enter c");
		int c = scn.nextInt();
		
		if(a>=b && a>=c){
			System.out.println("a is greatest");
		}
		else
			if(b>=c){
				System.out.println("b is greatest");
			}
			else
				System.out.println("c is greatest");

	}

}
