package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[]nums, int val) {
        int k = 0;
        int i;

        for(i=0;i< nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }

        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,2,2,3};
        int val = 3;
        int result = removeElement(nums1, val);
        System.out.println(result);
    }
}


