public class _23_PalindromicSubStrLeetCode647 {
    public static int countSubStr(String s)
    {
        int n = s.length();
        int total  = 0;

        for(int i = 0; i < n ; i++)
        {
            total += eac(s, i, i); // odd length..eac->expandAroundCenter

            total += eac(s, i, i+1); //even length
        }
        return total;
    }
    public static int eac(String s, int left, int right)
    {
        int count = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            count++;
            left--;
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSubStr("ABBC"));
    }
}
