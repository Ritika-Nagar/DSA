package arrays_questions;

public class Peak_index_in_mountain_array {
	
	public static int peak(int [] arr) {
		 
			
			int l=0,h=arr.length-1;
			int mid=(l+h)/2;
	        while(l<h){
	            if(arr[l]<arr[l+1]) {l=mid+1;}
	            else {
	            	h=mid;
	            }
	        }
	        
	
	        
	        return l;
	        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,6,5};
		
		System.out.println(peak(arr));
		System.out.println("Hello worls");
	}

}
