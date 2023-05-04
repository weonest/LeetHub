    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> set = new HashSet<>();

            int answer = 0;
            
            int idx = 0;
                for (int i = 0; i < s.length(); i++){
                    char cur = s.charAt(i);

                    if (!set.contains(cur)) {
                        set.add(cur);
                        answer = Math.max(answer, set.size());
                    } else {
                        while(s.charAt(idx) != cur) {
                            set.remove(s.charAt(idx));
                            idx++;
                        }
                        set.remove(idx);idx++;
                        set.add(cur);
                    }

            }
            return answer;
        }
    }