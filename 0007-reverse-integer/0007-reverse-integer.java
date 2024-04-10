class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0){
            rev += x % 10;
            x /= 10;
            if (x == 0) break;
            else {
                int next = rev * 10;
                if (next/10 != rev) return 0;
                rev *= 10;
            }
        }
        return rev;

    }
}