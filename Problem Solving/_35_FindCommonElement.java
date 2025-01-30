// Problem: Find common elements in three sorted arrays

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _35_FindCommonElement {
    public static ArrayList commonElement(int a[], int b[], int c[])
    {
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : a)
        {
            map.put(num ,1);
        }

        for(int num : b)
        {
            if(map.containsKey(num) && map.get(num) == 1)
            {
                map.put(num, 2);
            }
        }

        for(int num : c)
        {
            if(map.containsKey(num) && map.get(num) == 2)
            {
                map.put(num, 3);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int ele : map.keySet())
        {
            if(map.get(ele) == 3)
            {
                result.add(ele);
            }
        }

        return result;
    }

    public static void sort(int a[])
    {
        Arrays.sort(a);

        for(int ele : a)
        {
            System.out.println(ele);
        }

    }
    public static void main(String[] args) {

        int a[] = {1, 5, 10, 20, 30};
        int b[] = {5, 13,10, 15, 20};
        int c[] = {5, 20,10};

        sort(b);



        ArrayList<Integer> result = new ArrayList<>();
        result = commonElement(a, b, c);

        System.out.println(result);
    }
}
