import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String convert(String s, int numRows) {

        StringBuilder sb = new StringBuilder();
        Map<Integer, List<Character>> map = new HashMap<>();

        if (numRows == 1) {
            return s;
        }
        
        for (int i = 0; i < numRows; i++) {
            map.put(i, new ArrayList<>());
        }
        

        int idx = 0;
        int i = 0;
        boolean up = true;
        while (i != s.length()) {

            char c = s.charAt(i);

            map.get(idx).add(c);

            if (idx == numRows - 1) {
                up = false;
            }

            if (idx == 0) {
                up = true;
            }

            if (up) {
                idx++;
            } else{
                idx--;
            }

            i++;

        }

        for (Integer key : map.keySet()) {
            for (char c : map.get(key)) {
                sb.append(c);
            }
        }


        return sb.toString();
    }
}