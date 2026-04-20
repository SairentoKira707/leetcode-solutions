// Last updated: 20/04/2026, 15:55:30
class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0, el=0;
        for(int num: nums){
            if(cnt==0){
                el=num;
            }
            if(num==el){
                cnt++;
            }
            else cnt--;
        }
        return el;
    }
}