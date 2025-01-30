public class _27_leetcode2027 {
    // xx0x -> 0000 => min. moves to convert are 2
    public static int minmumMoves(String s)
    {
        int n = s.length();
        int count = 0;
        int i = 0;

        while (i < n)
        {
            if(s.charAt(i) == 'X')
            {
                count++;
                i += 3;
            }
            else {
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(minmumMoves("X0X0X"));
    }
}
