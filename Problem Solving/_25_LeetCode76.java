import java.util.HashMap;
import java.util.Map;

public class _25_LeetCode76 {
    public static String minWindow(String s, String t) {
            if (s == null || t == null || s.length() < t.length()) {
                return "";
            }

            Map<Character, Integer> tMap = new HashMap<>();
            for (char c : t.toCharArray()) {
                tMap.put(c, tMap.getOrDefault(c, 0) + 1);
            }

            Map<Character, Integer> windowMap = new HashMap<>();
            int left = 0;
            int right = 0;
            int minLen = Integer.MAX_VALUE;
            String minWindowStr = "";

            int required = tMap.size();
            int formed = 0;

            while (right < s.length()) {
                char rightChar = s.charAt(right);
                windowMap.put(rightChar, windowMap.getOrDefault(rightChar, 0) + 1);

                if (tMap.containsKey(rightChar) && windowMap.get(rightChar).intValue() == tMap.get(rightChar).intValue()) {
                    formed++;
                }

                while (left <= right && formed == required) {
                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                        minWindowStr = s.substring(left, right + 1);
                    }

                    char leftChar = s.charAt(left);
                    windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                    if (tMap.containsKey(leftChar) && windowMap.get(leftChar).intValue() < tMap.get(leftChar).intValue()) {
                        formed--;
                    }
                    left++;
                }
                right++;
            }
            return minWindowStr;
        }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));  // Expected Output: "BANC"
    }
}
