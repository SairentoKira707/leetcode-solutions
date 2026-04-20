// Last updated: 20/04/2026, 15:55:00
class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n=nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        List<Integer>result = new ArrayList<>();
        for(int q: queries){
            int val=nums[q];
            List<Integer> list=map.get(val);
            if(list.size()==1){
                result.add(-1);
                continue;
            }
            int pos=Collections.binarySearch(list,q);
            int size=list.size();
            int left=list.get((pos-1+size)%size);
            int right=list.get((pos+1)%size);
            int dist1=Math.abs(q-left);
            dist1=Math.min(dist1,n-dist1);
            int dist2=Math.abs(q-right);
            dist2=Math.min(dist2,n-dist2);
            result.add(Math.min(dist1,dist2));
        }
        return result;
    }
}