// Last updated: 20/04/2026, 15:55:39
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        long maxi= Long.MIN_VALUE;
        long sum=0;

        int start=0;
        int ansStart=-1;
        int ansEnd=-1;

        for(int i=0;i<n;i++){
            if(sum==0){
                start=i;
            }
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0){
                sum=0;
            }
        }
    return (int) maxi;
    }
}