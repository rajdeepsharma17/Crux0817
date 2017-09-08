package lecture2;

import java.util.Scanner;

public class CheckIfPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int c=0;
		for(int i=2;i<N-1;i++){
			if(N%i==0){
				c++;
			}
		}
		if(c>0){
			System.out.println("No. is not prime");
		}
		else
			System.out.println("no. is prime");
	}

}
