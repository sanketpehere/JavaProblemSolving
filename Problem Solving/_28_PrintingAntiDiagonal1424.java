import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _28_PrintingAntiDiagonal1424 {
    public static int[] printAntiDiagonal(List<List<Integer>> nums)
    {
        Map<Integer, List<Integer>> mapDiagonal = new HashMap<>();

        //integer -> key(i + j)
        // because the element with the same sum (i + j) are diagonal
        //List<Integer> stores the elements with same sum


        // we have added all the diagonal elements in the map with their corrosponding sum of indices
        int totalElements = 0;
        for(int i = 0; i < nums.size(); i++){
            for(int j = 0; j < nums.get(i).size(); j++){
                int key = i+j;
                if(!mapDiagonal.containsKey(key)){
                    mapDiagonal.put(key, new ArrayList<>());
                }
                mapDiagonal.get(key).add(nums.get(i).get(j));
                totalElements++;
            }
        }

        // declaring the array to print all the diagonal elements
        int result[] = new int[totalElements];
        int index = 0;
        for(int key = 0; key < mapDiagonal.size(); key++){
            // extracted the keyth list
            List<Integer> diagonalList = mapDiagonal.get(key);

            // need to add it into the result in the reverse order
            for(int i = diagonalList.size() - 1; i >= 0; i--)
            {
                result[index++] =  diagonalList.get(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        List<Integer>l2 = new ArrayList<>();
        l2.add(4);
        l2.add(5);

        List<Integer>l3 = new ArrayList<>();
        l3.add(7);
        l3.add(8);
        l3.add(9);

        nums.add(l1);
        nums.add(l2);
        nums.add(l3);

        System.out.println(nums);
        System.out.println();

        int result[] = printAntiDiagonal(nums);

        for(int num : result)
        {
            System.out.print(num + " ");
        }
    }
}
