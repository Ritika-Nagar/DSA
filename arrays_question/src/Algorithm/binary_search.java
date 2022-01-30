package Algorithm;

public class binary_search {

	public static int bin_search(int[] nums, int left, int right, int target) {
		
		// time complexity= O(logn)

		if (left > right) {//base case
            return -1;
        }
 
        
        int mid = (left + right) / 2;// left+(right-left)/2
 
      
 
        if (target == nums[mid]) {
            return mid;
        }
 
       
        else if (target < nums[mid]) {
            return bin_search(nums, left, mid - 1, target);
        }
 
        
        else {
            return bin_search(nums, mid + 1, right, target);
        }
		  
		 
		 

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 7,9,11};
		int find = 11;
		int l = 0;
		int r = 4;
		
		System.out.println(bin_search(arr, l, r, find));

		;
	}

}
