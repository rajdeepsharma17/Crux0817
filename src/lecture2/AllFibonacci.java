package lecture2;

import java.util.Scanner;

public class AllFibonacci {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		int N = scn.nextInt();
		System.out.println(1);
		for(int i= 0;i<=N;i++){
			int n1 = i-1;
			int n2 = i-2;
			
			if(i == n1+n2){
				System.out.println(i);
			}
		}
scn.close();
	}
	

}
