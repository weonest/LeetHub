import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public String intToRoman(int num) {
        StringBuilder answer = new StringBuilder();

        Map<Integer, String> map = new LinkedHashMap<>();
        
        map.put(1000, "M");

        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");

        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");

        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        for (int i : map.keySet()) {
            if (num / i != 0) {
                while (num / i != 0) {
                    answer.append(map.get(i));
                    num -= i;
                }
            }
        }

        return answer.toString();
    }
}