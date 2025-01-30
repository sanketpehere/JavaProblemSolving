public class _13_ValidAnagarm {
    public static boolean isAnagram(String a, String b)
    {
        if(a.length() != b.length())
        {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        int countA[] = new int[26];
        int countB[] = new int[26];

        for(int i = 0; i < a.length(); i++)
        {
            countA[a.charAt(i) - 'a']++;
            countB[b.charAt(i) - 'a']++;
        }

        for(int i = 0; i< 26; i++){
            if(countA[i] != countB[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("Sansket", "asnkSet"));
    }
}
