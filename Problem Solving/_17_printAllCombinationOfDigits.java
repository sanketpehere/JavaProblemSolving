import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _17_printAllCombinationOfDigits {
    public static List<String> printAllCombinations(String digits)
    {
        if(digits == null || digits.length()==0){
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        recursion(result, new StringBuilder(), 0, digits, map);

        return result;
    }
    public static void recursion(List<String>result, StringBuilder current, int index, String digits, HashMap<Character, String> map){
        if(index == digits.length())
        {
            result.add(current.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = map.get(digit);

        for(char letter : letters.toCharArray())
        {
            current.append(letter);
            recursion(result, current, index + 1, digits, map);
            current.deleteCharAt(current.length() - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(printAllCombinations("23"));
    }
}
