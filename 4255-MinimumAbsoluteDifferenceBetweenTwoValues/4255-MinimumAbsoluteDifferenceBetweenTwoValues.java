// Last updated: 20/04/2026, 15:55:04
class Solution {
    public int minAbsoluteDifference(int[] nums) {

        int result = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==2){
                        result=Math.min(result,Math.abs(i-j));
                    }
                }
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result ;
        
    }
}