public class Shuffle {
    class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=nums.length;
        int arr[]=new int[l];
        int j=0;
        
        for(int i=0;i<n;i++){
            arr[j]=nums[i];
            j++;
            arr[j]=nums[i+n];
            j++; 
        }
        return arr;
    }
}
    
}
