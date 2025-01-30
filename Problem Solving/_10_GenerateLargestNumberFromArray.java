//Arrange given numbers to form the biggest number
import java.util.*;
public class _10_GenerateLargestNumberFromArray {
    public static String biggestNum(int arr[])
    {
        // convert elements of arr to string
        String[]  strNums = new String[arr.length];

        for(int i = 0; i < arr.length;i++){
            strNums[i] = String.valueOf(arr[i]);
        }

        // need to sort strNums in descending order
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String ans1 = o1 + o2;
                String ans2 = o2 + o1;

                return o2.compareTo(o1);
            }
        });

        // edge case: if largest is 0 then return 0;
        if(strNums[0].equals("0"))
        {
            return "0";
        }

        String res = "";

        //generate largest number
        for(String str : strNums)
        {
            res += str;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {30, 60, 5, 4, 9};
        System.out.println(biggestNum(arr));
    }

}
