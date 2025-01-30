import java.util.Arrays;

public class _15_LongestCommonPrefix {
    public static String lcp(String str[])
    {
        if(str.length == 0){
            return "";
        }
        if(str.length == 1)
        {
            return str[0];
        }

        Arrays.sort(str);

        String firstString = str[0];
        String lastString = str[str.length -1];

        int i =0;
        while(i < firstString.length() && firstString.charAt(i) == lastString.charAt(i)) i++;

        return firstString.substring(0, i);
    }
    public static void main(String[] args) {
        String[] str = {"Flower", "Flight", "Flowed"};
        System.out.println(lcp(str));
    }
}
