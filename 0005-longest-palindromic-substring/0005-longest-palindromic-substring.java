class Solution {
    public String longestPalindrome(String s) {
        
        if (s == null || s.length() < 1) return "";
        
        
        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int len = Math.max(expand(s, i, i), expand(s, i, i+1)); // 홀수 짝수
                
            if (len > end - start) { // 최대 길이 설정
                start = i - (len - 1) / 2 ;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    public int expand(String s, int left, int right) {
        if (s == null || left > right) return 0;
        
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            
            left--;
            right++;
        }
        return right -left - 1;
    }
}
