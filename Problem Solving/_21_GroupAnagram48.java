import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class _21_GroupAnagram48 {
    public static List<List<String>> groupAnagrams(String[] strs)
    {
        if(strs == null || strs.length == 0)
        {
            return new ArrayList<>();
        }
        HashMap<String, List<String >> map = new HashMap<>();

        for(String str : strs)
        {
            char[] chars = str.toCharArray();

            Arrays.sort(chars);

            String sortedString = new String(chars);

            if(!map.containsKey(sortedString))
            {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args)
    {
       String[] str = {"eat", "ate", "tea", "and", "nad", "dan", "san", "nas", "bat"};
        System.out.println(groupAnagrams(str));
    }
}
