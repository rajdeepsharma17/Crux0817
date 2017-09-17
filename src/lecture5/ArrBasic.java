package lecture5;

import java.util.Scanner;

public class ArrBasic {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = scn.nextInt();
		int[] arr  = new int[n];
		takeInput(scn, arr);
		int ans = binarySearch(arr,6);
		System.out.println(ans);
		//		insertionSort(arr);
		//		bubblesort(arr);
		//		int max = max(arr);
		//		System.out.println(max);
		//		int search = search(arr, 5);
		//		System.out.println(search);
		scn.close();
	}

	public static void  takeInput(Scanner scn, int[] arr){
		for(int i = 0;i<arr.length;i++){
			System.out.println("enter"+ (i+1)+ "Element");
			arr[i] = scn.nextInt();
		}
	}


	public static void display(int[] arr){
		for(int i = 0;i< arr.length;i++){
			System.out.print(arr[i]+", ");
		}
		System.out.println("End");
	}

	public static int max(int[] arr){
		int max = arr[0];
		for(int i=0; i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}

	public static int search(int[] arr, int num){
		int i;int counter = -1;
		for( i = 0;i<arr.length;i++){
			if(arr[i]==num){
				counter = i;	
			}
		}
		return counter;

	}

	public static void swap(int[] arr, int i, int j){
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void bubblesort(int arr[]){
		int i;
		for(i=0;i<arr.length-1;i++){
			for(int j = 0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
		display(arr);
	}

	public static void insertionSort(int arr[]){
		for(int i = 1;i<arr.length;i++){
			for(int j = i-1;j>=0;j--){
				if(arr[j]>arr[j+1]){
					swap(arr,j ,j+1);
				}
			}
		}
	}

	public static void selectionSort(int arr[]){
		for(int i = 0;i<arr.length;i++){
			int minIndex = i;
			for(int j = i+1;j>=0;j--){
				if(arr[minIndex]<arr[j]){
					minIndex = j;
				}
			}
			swap(arr,i,minIndex);
		}
		display(arr);
	}

	public static void reverse(int[] arr){
		for(int i =0;i<arr.length;i++){
			int flag = arr.length-i-1;
			swap(arr,i,flag);
		}
	}
	
	public static int binarySearch(int[] arr, int num){
		selectionSort(arr);
		int si = 0;
		int ei = arr.length - 1;
		while(si<=ei){
			int mid = (si+ei)/2;
			if(num == arr[mid]){
				return mid;
			}else if(num>arr[mid]){
				si = mid+1;
			}else{
				ei = mid -1;
			}
		}
		return -1;
	}
}
