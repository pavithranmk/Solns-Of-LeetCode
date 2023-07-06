import java.util.Arrays;

public class Merge {
    

    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int a=m+n;
      int j=0;
      for(int i=m;i<a;i++){
          nums1[i]=nums2[j];
          j++;
        }  
        Arrays.sort(nums1);
        for(int i=0;i<a;i++){
            System.out.println(nums1[i]);
        }
    }
  }

    

