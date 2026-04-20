// Last updated: 20/04/2026, 15:55:02
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        Scanner sc = new Scanner(System.in);
        int y = x;
        int sum= 0;
        while(x!=0){
            int digit = x%10;
            sum = sum + digit;
            x = x/10;
        }
        if(y % sum==0){
        return sum;}
        else {return -1;}
        
    }
}