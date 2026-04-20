// Last updated: 20/04/2026, 15:55:32
class Solution {
    public int singleNumber(int[] nums) {
        int xorr=0;
        for(int num:nums){
            xorr=xorr^num;
        }
        return xorr;
    }
}