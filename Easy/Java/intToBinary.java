// Problem: Convert integer to binary. Convert binary to integer
// Runtime: O(n)

import java.util.*;
public class MyClass {
    public static void main(String args[]) {

        System.out.println(binary(47));

    }

    public static String binary(int x) {

        ArrayList<Integer> list = new ArrayList<>();

        while (x > 0) {
            int rem = x % 2;
            list.add(rem);
            x = (int) Math.floor(x/2);

        }

        Collections.reverse(list);
        String ans = "";

        for (int i = 0; i < list.size(); i++) {
            ans = ans + list.get(i);
        }

        return ans;
    }

    public static int getDecimal(int binary) {
      int decimal = 0;
      int n = 0;

      while(true){

        if(binary == 0){
          break;

        }
        else {
            int temp = binary % 10;
            decimal += temp * Math.pow(2, n);
            binary = binary/10;
            n++;
         }
      }
    return decimal;
  }
}
