package lecture2;

import java.util.Scanner;

public class AllPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		int N;
		for(N=2;N<=T;N++){
			for(int i=2;i<N;i++){
				if(N%i==0){
					break;
				}
				if(i==N){
					System.out.println(N);
				}
			}
		}
	}
}
				
				
		
