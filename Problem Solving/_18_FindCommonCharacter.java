import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18_FindCommonCharacter {
    public static List<String> findCommon(String[] words)
    {
        // defining array to store minFreq of each character in each word
        int minFreq[] = new int[26];

        // initializing it to infinity
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for (String word : words)
        {
            int charFreq[] = new int[26];

            for(char c : word.toCharArray())
            {
                charFreq[c - 'a']++;
            }

            for(int i =0; i < 26; i++)
            {
                minFreq[i] = Math.min(minFreq[i], charFreq[i]);
            }
        }
        List<String> result = new ArrayList<>();

        for(int i = 0; i < 26; i++){
            for(int j = 0; j < minFreq[i]; j++){
                result.add(String.valueOf((char) (i + 'a')));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] words = {"abb", "abc", "acb"};
        System.out.println(findCommon(words));
    }
}
