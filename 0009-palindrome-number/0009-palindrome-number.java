class Solution {
    public boolean isPalindrome(int x) {
        boolean answer = false;

        String num = String.valueOf(x);

        StringBuilder sb = new StringBuilder();
        sb.append(num);


        if (num.equals(sb.reverse().toString())) {
            answer = true;
        }


        return answer;
    }
}