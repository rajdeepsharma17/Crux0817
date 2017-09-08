package lecture2;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		
		for(int i=1;i<=N;i++){
			for(int j=N;j>i;j--){
				System.out.print(" ");
			}
			int count = i;
			for(int j=1;j<=i;j++){
				System.out.print(count);
				count++;
			}
			count = count-2;
			for(int j=1;j<i;j++){
				System.out.println(count);
				count++;
			}
		}

	}

}
