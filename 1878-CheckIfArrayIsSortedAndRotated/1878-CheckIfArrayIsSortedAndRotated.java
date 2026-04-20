// Last updated: 20/04/2026, 15:55:15
class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count ++;
            }
        }
        return count<=1;
    }
}