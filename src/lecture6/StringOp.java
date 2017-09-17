package lecture6;

import java.util.Scanner;

public class StringOp {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		for(int i=0;i<str.length();i++){
			for (int j= i+1;j<=str.length();j++){
				String ans = str.substring(i, j);
				System.out.println(ans);
				scn.close();
			}
		}
		

	}
	
	public static void palindrome(String str){
		for(int i=0;i<=str.length();i++){
			for(j=)
		}
	}

}
