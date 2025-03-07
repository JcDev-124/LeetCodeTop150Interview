package arrays;

import java.util.Arrays;

public class RemoveDuplicates {


    public static int removeDuplicates(int[] nums){
        int i = 0;
        int j = 0;
        int[] nums2 = nums;
        int k = 0;

        for(i = 0; i < nums2.length; i++){
            if(nums2[i] != nums[j]){
                j++;
                nums[j] = nums2[i];
            }else{k++;}
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nuns = {1,1,2};
        int reuslt = removeDuplicates(nuns);
        System.out.println(reuslt);
    }
}
