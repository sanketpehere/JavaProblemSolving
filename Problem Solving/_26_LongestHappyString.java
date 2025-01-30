public class _26_LongestHappyString {
    public static int longestHappyString(String s)
    {
        int n = s.length();

        int lps[] = new int[n];
        // lps is an array where lps[i] stores the length of the longest substring
        // which is prefix as well as suffix for the substring s[0...i];

        int length = 0;
        int i = 1;
        while (i < n)
        {
            if(s.charAt(i) == s.charAt(length))
            {
                length++;
                lps[i] = length;
                i++;
            }
            else {
                if(length!=0)
                {
                    length = lps[length - 1];
                }
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps[n -1]; // length of longest substr which is prefix as well as suffix of the string
    }
    public static void main(String[] args) {
        System.out.println(longestHappyString("SanketSanket"));
    }
}
