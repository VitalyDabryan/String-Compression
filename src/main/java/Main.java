//        Run-length encoding is a string compression method that works by replacing consecutive
//        identical characters (repeated 2 or more times) with the concatenation of the character
//        and the number marking the count of the characters (length of the run).
//        For example, to compress the string "aabccc" we replace "aa" by "a2" and replace "ccc" by "c3".
//        This the compressed string becomes "a2bc3".
//
//        Notice that in this problem, we are not adding '1' after single characters.
//
//        Find the minimum length of the run-length encoded version of s.

public class Main {
    public static void main(String[] args) {
        String str = "aaabcccd";
        String newStr = "";
        newStr += str.charAt(0);

        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                if (str.charAt(i) != str.charAt(i-1)) newStr += str.charAt(i-1);
                while (str.charAt(i) == str.charAt(i-1)) {
                    count++;
                    i++;
                }
                newStr += count; i--;
            } else {
                newStr += str.charAt(i);
                count = 1;
            }
        }
        System.out.println("New string now is:" + newStr);
    }
}
