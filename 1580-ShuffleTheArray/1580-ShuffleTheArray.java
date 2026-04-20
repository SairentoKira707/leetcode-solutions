// Last updated: 20/04/2026, 15:55:16
class Solution {
    public int[] shuffle(int[] nums, int n) {
        for(int i=0; i<n;i++){
            nums[i] += (nums[n+i] * 1024);
        }
        for(int i=n-1;i>=0;i--){
            nums[2*i+1]=nums[i]/1024;
            nums[2*i]= nums[i]%1024;
        }
        return nums;
    }
}