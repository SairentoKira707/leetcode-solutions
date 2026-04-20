// Last updated: 20/04/2026, 15:55:24
class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do{slow = nums[slow];
        fast = nums[nums[fast]];
        } while (slow!=fast);
        slow = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}