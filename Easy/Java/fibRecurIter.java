public class fibonacci{

     public static void main(String []args){
        System.out.println(fibRec(7));
        System.out.println(fibIter(7));
     }

     public static int fibRec(int n) {
         if (n == 0) {
             return 0;
         }
         else if (n == 1) {
             return 1;
         }
         else {
             return fibRec(n - 1) + fibRec(n - 2);
         }
     }

     public static int fibIter(int n) {

         int fib = 1;
         int prevFib = 1;

         if (n == 0) {
             return 0;
         }
         else if (n == 1) {
             return 1;
         }
         else {
           // start at the second sequence of fib
             for (int i = 2; i < n; i++) {
			            int temp = fib;
			            fib = fib + prevFib;
			            prevFib = temp;
		          }
         }
         return fib;
     }
}
