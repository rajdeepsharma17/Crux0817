package lecture2;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int n = scn.nextInt();
		
		int row = 1;
		int counter = 1;
		while(row<=n){
			int col = 1;
			while(col<=row){
				System.out.print(counter+ " ");
				counter = counter + 1;
				col = col +1;
			}
			System.out.println();
			row = row + 1;
		}

	}

}
