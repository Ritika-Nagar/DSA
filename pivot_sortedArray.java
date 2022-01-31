package arrays_questions;

public class pivot_sortedArray {
	public static int pivot(int [] arr) {
		int s=0;
		int e=arr.length-1;
		int mid= s+(e-s)/2;
		while(s<e) {
		if(arr[mid]>=arr[0]) {
			s=mid+1;
		}
		else {
			e=mid;
		}
		
		mid= s+(e-s)/2;
		}
		return arr[e];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {11,13,15,17};
		
		System.out.println(pivot(arr));
	}

}
