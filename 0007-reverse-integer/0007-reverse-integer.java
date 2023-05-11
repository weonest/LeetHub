class Solution {
    public int reverse(int x) {

        long rev = 0;

        while (x != 0) {
            int pick = x % 10;
            x /= 10;
            rev = rev * 10 + pick;


            if (rev > Integer.MAX_VALUE) {
                return 0;
            }
            
            if (rev < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) rev;

    }
}