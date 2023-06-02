import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    int size = 0;
    Map<Character, String> map = new HashMap<>();
    List<String> answer = new ArrayList<>();


    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0 || digits == null) return new ArrayList<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        size = digits.length();
        dfs(digits, new StringBuilder());

        return answer;
    }

    public void dfs(String digits, StringBuilder sb) {
        if (size == sb.length()) {
            answer.add(sb.toString());
            return;
        }

        String str = map.get(digits.charAt(0));

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            dfs(digits.substring(1), sb);
            sb.setLength(sb.length() - 1);
        }
    }
}