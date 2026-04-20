// Last updated: 20/04/2026, 15:55:46
class Solution {
    public boolean isPalindrome(int x) {
        if ( x < 0 || ( x % 10 == 0 && x != 0)){
            return false;
        }
        int reversedHalf = 0 ;
        while (x > reversedHalf){
            int digit = x % 10 ;
            reversedHalf = reversedHalf * 10 + digit ;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }
}