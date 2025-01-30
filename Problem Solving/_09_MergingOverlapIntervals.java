import java.util.*;

public class _09_MergingOverlapIntervals {

    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0])); // sorted the array based oth element

        List<int[]> ans = new ArrayList<>();

        for (int[] interval : intervals) {
            // if ans is empty or element at 1st index int prev. interval is less than oth index element   of current interval... then they do not overlap.
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0]) {
                // added to the ans
                ans.add(interval);
            }
            //if they overlapp
            else {
                // need to update the end value of previous interval to the end of the current interval
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {2, 6}, {5, 9}, {0, 10}};
        int ans[][] = merge(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
