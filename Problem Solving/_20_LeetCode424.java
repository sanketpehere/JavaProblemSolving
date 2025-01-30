public class _20_LeetCode424 {
    public static int characterReplacement(String s, int k)
    {
        int charCount[] = new int[26];
        int left = 0;
        int maxC = 0;
        int maxLen = 0;

       for(int right = 0; right < s.length(); right++){
           char currChar = s.charAt(right);
           charCount[currChar - 'A']++;
           maxC = Math.max(maxC, charCount[currChar - 'A']);

           while (right - left + 1 - maxC >k)
           {
               charCount[s.charAt(left) - 'A']--;
               left++;
           }
           maxLen = Math.max(maxLen, right - left + 1);
        }
        return  maxLen;
    }
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }
}
