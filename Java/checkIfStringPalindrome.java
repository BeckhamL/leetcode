// odd length words that have has all successes shouldnt need to check the middle char
// e.g. rar ---- since r == r
public class isPalindrome{

     public static void main(String []args){
        System.out.println(isPalindrome("adtadatda"));
     }

     public static boolean isPalindrome(String s) {

         int first = 0;
         int last = s.length() -1;

         while (first < last) {
             if (s.charAt(first) != s.charAt(last)) {
                 return false;
             }
             else {
                 first++;
                 last--;
             }
         }
         return true;
     }
}
