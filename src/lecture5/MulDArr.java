package lecture5;

import java.util.Scanner;

public class MulDArr {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = scn.nextInt();
		int[][] arr = new int[n][];
		takeInput(scn, arr);

	}


	public static void takeInput(Scanner scn, int[][] arr){
		for(int row = 0;row <arr.length;row++){
			System.out.println("Enter numbers of columns in row");
			int cols = scn.nextInt();
			arr[row] = new int[cols];
			for(int col = 0; col < arr[row].length;col++){
				System.out.println("Enter element at "+row+","+col);
				arr[row][col] = scn.nextInt();
			}
		}
	}

	public static void display(int[][] arr){
		for(int row = 0; row< arr.length;row++){
			for(int col = 0;col <arr[row].length;col++){
				System.out.println(arr[row][col]+",");
			}
			System.out.println("End");
		}
	}

	public static void waveDisplay(int arr[][]){
		for(int col = 0;col<arr[0].length;col++){
			if(col%2==0){
				for(int row = 0;row<arr.length;row++){
					System.out.println(arr[row][col]);
				}
			}else{
				for(int row = arr.length-1;row>=0;row--){
					System.out.println(arr[row][col]);
				}

			}
		}

	}
	
	public static void spiralDisplay(int[][] arr){
		int maxele = arr.length*arr[0].length;
		int colMin = 0, colMax = arr[0].length-1;
		int rowMin = 0, rowMax = arr.length;
		int counter = 1;
		while(counter <= maxele ){
			for(int i = rowMin ; i<= rowMax; i++){
				System.out.println(arr[i][colMin]+", ");
			}
			colMin += 1;
			
			for(int i = colMin; i<= colMax; i++){
				
			}
			counter +=1;
		}

	}
}
