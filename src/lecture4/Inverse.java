package lecture4;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Number");
		int N = scn.nextInt();
		int inv = inverse(N);
		System.out.println("Inverse is : "+ inv);
		scn.close();

	}
	
	public static int inverse(int N){
		int inverse = 0;
		while(N!=0){
			int rem = N%10;
			inverse += rem*(int)(Math.pow(10, rem-1));
			N= N/10;
		}
		return inverse;
	}

}
