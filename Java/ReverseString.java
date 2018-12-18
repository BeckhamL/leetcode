// This is a solution using built in functions
public class Solution {
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}

// My own Solution
class Solution {
    public String reverseString(String s) {

        char[] charString = new char[s.length()];
        int left = 0;
        int right = s.length() - 1;

        // create a char[] with every character in string
        for (int i = 0; i < s.length(); i++) {
            charString[i] = s.charAt(i);
        }

        // use 2 pointers and swap the chars until I reach the end
        while (left < right) {
            char temp = charString[left];
            charString[left] = charString[right];
            charString[right] = temp;
            left++;
            right--;
        }

        String newS = new String(charString);
        return newS;
    }
}

// Doing it recursively
public class Solution{

     public static void main(String []args){
        recurString("hello");
     }

     public static void recurString(String s) {
         if (s == null || s.length() <= 1) {
             System.out.println(s);
         }
         else {
             System.out.print(s.charAt(s.length()-1));
             recurString(s.substring(0, s.length()-1));
         }
     }
}
