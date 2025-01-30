// given array 1 to n
// need to find missing and repeating element

import java.util.ArrayList;

public class _03_findingMissingAndRepeatingElement {
    public static ArrayList<Integer> findingMissRepeat(int arr[])
    {
        int n = arr.length;
        // calculate expected 1 to n sum
        long sumN = (long) n*(n+1)/2;
        //calculate expected 1 to n sumSquare
        long sumSqN = (long) (n*(n+1)*(2*n +1))/ 6;

        // calculate actual sum of array and sum Square also
        long sumArr = 0;
        long sumArrSq = 0;
        for(int i = 0; i < n ;i++)
        {
            sumArr += arr[i];
            sumArrSq += (arr[i] * arr[i]);
        }

        long x = sumN - sumArr; // (A - B)
        long y = sumSqN - sumArrSq; // (A2 - B2);

        long aPlusb = y / x; // A + B
        long aMinusb = x; // A - B

        int A = (int) (aPlusb + aMinusb) / 2;
        int B = (int) (aPlusb - aMinusb) / 2;

        ArrayList<Integer> result = new ArrayList<>();


        result.add(A); // missing
        result.add(B); // repeated

        return result;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,4};
        System.out.println(findingMissRepeat(arr));
    }
}
