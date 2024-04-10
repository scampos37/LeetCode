class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int num = x, reverse = 0;
        while (num != 0){
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }

        if (x == reverse){
            return true;
        }
        else{
            return false;
        }
    }
}