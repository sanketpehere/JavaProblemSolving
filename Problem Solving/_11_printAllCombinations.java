// given n, and k, need to print combinations

import java.util.ArrayList;
import java.util.List;

public class _11_printAllCombinations {
    public  static List<List<Integer>> combination(int n, int k){
        List<List<Integer>> result = new ArrayList<>();

        generateCombinations(1, n, new ArrayList(), result, k);

        return result;
    }
    public static void generateCombinations(int start, int n, List<Integer> curr, List<List<Integer>> result, int k)
    {
        if(curr.size() == k)
        {
            result.add(new ArrayList(curr));
            return;
        }
//        result.add(new ArrayList<>(curr)); // generate all combinations

        for(int i = start; i<= n; i++){
            curr.add(i);
            generateCombinations(i+1, n, curr, result, k);
            curr.remove(curr.size() - 1);
        }
    }
    public static void main(String[] args) {

        List<List<Integer>> result = new ArrayList<>();
        result = combination(5, 3);
        System.out.println(result);

    }
}
