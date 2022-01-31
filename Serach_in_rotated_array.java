package arrays_questions;

public class Serach_in_rotated_array {
	public static int pivot(int [] arr) {
		int s=0;
		int e=arr.length-1;
		int mid= s+(e-s)/2;
		
		if(arr[s]>arr[e]) return e;
		while(s<e) {
		if(arr[mid]>arr[0]) {
			s=mid+1;
		}
		else {
			e=mid;
		}
		
		mid= s+(e-s)/2;
		}
		
		return s;
		
	}
    
    public static int bs(int [] arr, int s, int r, int k){
        
        int mid= (s+r)/2;
        while(s<=r){
        	
            if(arr[mid]==k){return mid;}
            else if(arr[mid]>k){
                r=mid-1;
            }else{s=mid+1;}
            mid=(s+r)/2;
        }
       
        return -1;
        
    }
    
    public static int search(int[] nums, int target) {
        int pivot= pivot(nums);
        System.out.println("pivot "+pivot);
       
        int end=nums.length;
     
        if(target >=nums[pivot] && target<=nums[end-1]){
        	
            return bs(nums,pivot,end-1, target);
        }else{
       
            return  bs(nums,0,pivot-1, target);
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,1};
		int target=1;
		
		
		
	System.out.println(search(arr,target));

	}

}
