import java.util.Arrays;

class Solution {

    public static void main(String []args){
        int[] nums1 = new int[]{1,2,3,3,3,4};
        int val = 3;
        int result = removeElement(nums1, val);
        System.out.println(result);
        System.out.println(Arrays.toString(nums1));
    }
    
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
