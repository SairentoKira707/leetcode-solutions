// Last updated: 20/04/2026, 15:55:43
class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i= nums.length-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        reverse(nums ,ind+1,nums.length-1);
    }
    private void reverse(int[] arr, int start, int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    private void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}