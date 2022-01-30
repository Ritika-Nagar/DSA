package arrays_question;
import java.util.Scanner;

public class array_elem_swap {
	// SWAPPING OF ADJACENT ELEMENT IN AN ARRAY
	public static void swap(int [] arr, int i,int j) {
		int temp= arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
		
		
	}
	public static void printArray(int[]arr, int size) {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void arrayswap(int [] a)
	{		int n= a.length;
			int i;
			int j= 1;
			/*
			 * while(i<j && i<n && j<n) {
			 * 
			 * swap(a,i,j); i=i+2; j=j+2; }
			 */
			
			for(i=0; i<n;i=i+2) {
				if(i+1<n) {
				swap(a, i, i+1);}
			
			}
	}	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int [] arr = new int[n];
	
	for(int i=0; i<n;i++) {
		arr[i]=sc.nextInt();
	}
	
	arrayswap(arr);
	printArray(arr,n);
	
	sc.close();
	
	
	
	}
}
