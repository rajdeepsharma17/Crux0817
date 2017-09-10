package lecture4;

import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		
		for(int cases = 1;cases<=N; cases++){
			int F = scn.nextInt();
			double C = (5.0/9)*(F-32);
			System.out.print(F+ " ");
			int e = (int) C;
			System.out.println(e);
		}
		scn.close();
	}

}
