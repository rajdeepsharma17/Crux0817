package lecture4;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter No.");
		int N = scn.nextInt();
		System.out.println("Enter Power");
		int pow = scn.nextInt();
		int Number = power(N,pow);
		System.out.println(Number);
		scn.close();
		

	}
	
	public static int power(int N, int pow){
		int Num =1;
		for(int i =1;i<=pow;i++){
			Num=Num*N;
		}
		return Num;
	}

}
