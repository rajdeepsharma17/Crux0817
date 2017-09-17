package lecture4;

//Fix this code
import java.util.Scanner;

public class B2D {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter binary number");
		int bin = scn.nextInt();
		int dec = b2d(bin);
		int oct = b2o(bin);
		System.out.println("Decimal is: " + dec);
		System.out.println("Octal is "+ oct);
		
		System.out.println("enter decimal number");
		dec = scn.nextInt();
		 bin = d2b(dec);
		 System.out.println(bin);

	}
	
	public static int b2d(int bin){
		int dec=0;int basepow = 1;
		
		while(bin!=0){
			int rem= bin%10;
			dec = dec + rem*basepow;
			basepow *= 2;
			bin = bin/10;
		}
		return dec;
	}
	
	public static int b2o(int bin){
		int dec=0;int basepow = 1;
		
		while(bin!=0){
			int rem= bin%10;
			dec = dec + rem*basepow;
			basepow *= 8;
			bin = bin/10;
		}
		return dec;
	}
	
	public static int d2b(int dec){
		int bin=0;int basepow = 1;
		
		while(dec!=0){
			int rem= dec%2;
			bin = bin*basepow + rem ;
			basepow *= 10;
			dec = dec/2;
		}
		return bin;
	}
	

}
