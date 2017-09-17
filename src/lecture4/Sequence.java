package lecture4;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter n:");
		int n = scn.nextInt();
		System.out.println("enter 1st element");
		int prev = scn.nextInt();
		
		int counter = 2;
		boolean dec = true;
		
		while(counter  <=n){
			System.out.println("enter "+ counter+ " element of seq");
			int current = scn.nextInt();
			if(dec){
				if(prev < current){
					dec =  false;
				}
			}else{
				if(prev > current){
					System.out.println("Invalid");
					return;
				}
			}
			prev = current;
			
			counter += 1;
		}
		

	}

}
