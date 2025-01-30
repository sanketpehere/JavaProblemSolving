public class _12_StringPalindrome {
    public static boolean isPalindrome(String str)
    {
        StringBuilder cleanedStr = new StringBuilder();
        for(char s : str.toCharArray())
        {
            if(Character.isLetterOrDigit(s))
            {
                cleanedStr.append(Character.toLowerCase(s));
            }
        }
        String cleaned = cleanedStr.toString();
        String reversed = cleanedStr.reverse().toString();

        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race car"));
    }
}
