// Problem: Convert integer to binary.
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
}
