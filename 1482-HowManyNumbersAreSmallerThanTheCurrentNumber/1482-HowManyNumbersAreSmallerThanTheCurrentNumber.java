// Last updated: 20/04/2026, 15:55:17
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];
        for(int num: nums){
            freq[num]++ ;
        }
        for(int i=1;i<101;i++){
            freq[i]+=freq[i-1];
        }
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) {
                result[i] = 0;
            }else{
                result[i] = freq[nums[i]-1];
            }
        }
        return result;
    }
}