package arrays_question;

import java.util.HashMap;
import java.util.Map;

public class unique_occure_arr {
public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        
        // Now retrive the number of occurences
    int ans=0; 
        
    for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
    
        ans= ans^entry.getValue();
    }
        
        if(ans==0){
            return false;
        }
        
        else{return true;}
        
    

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
