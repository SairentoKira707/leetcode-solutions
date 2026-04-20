// Last updated: 20/04/2026, 15:54:59
class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int x=n;
        while(x>0){
            int digit = x%10;
            rev = rev*10 + digit;
            x /= 10;
        }
        return Math.abs(n - rev);
    }
}