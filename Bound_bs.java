package arrays_question;

public class Bound_bs {
	public static int firstOccur(int [] arr, int n, int k) {
		int start=0;
		int end= n-1;
		int ans=-1;
	
		
		int mid = (start+end)/2;;
		while(start<end) {
		if(arr[mid]==k) {
			ans=mid;
			end=mid-1;
			
		}
		else if(arr[mid]> k) {
			end=mid-1;
		}
		else  {
			start=mid+1;
		}
			
		mid=(start+end)/2;
		}
		return ans;
	}
		
	
	public static int lastOccur(int [] arr, int n, int k) {
		int start=0;
		int end= n-1;
		int ans=-1;
		if(start> end) {
			return ans;
		}
		int mid= (start+end)/2;
		
		if(arr[mid]==k) {
			ans=mid;
			return lastOccur(arr, mid+1, end);
		}
		else if(arr[mid]> k) {
			return lastOccur(arr, start, mid-1);
		}
		else {
			return lastOccur(arr, mid+1,end);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {0, 0, 1, 1, 2, 2, 2, 2};
		
		System.out.println("First occurence of 2 is "+ firstOccur(arr, 8,2));
		//System.out.println("last occurence of 2 is "+ lastOccur(arr, 5,2));
		

	}

}
