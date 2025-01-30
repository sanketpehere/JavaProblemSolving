public class _14_RemoveConsecutiveCharacter {
    public static String removeConsecutiveChar(String str)
    {
        //initialize stringBUilder
        StringBuilder newStr = new StringBuilder();

        //append first character to newStr
        newStr.append(str.charAt(0));

        for(int i = 1; i < str.length(); i++){
            //extract currChar
            char currChar = str.charAt(i);
            //compare it with previous
            if(currChar != str.charAt(i - 1))
            {
                // if not same appended to the newStr
                newStr.append(currChar);
            }
        }
        return newStr.toString();

    }
    public static void main(String[] args) {
        System.out.println(removeConsecutiveChar("aabbccceddd"));
    }
}
