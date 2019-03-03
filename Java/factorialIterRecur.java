public class factorial{

     public static void main(String []args){

       int iter = factorialIter(4);
       int recur = factorialRecur(4);

       System.out.println(iter + " " + recur);
     }

     public static int factorialIter(int n) {

         int val = 1;
         for (int i = 1; i <= n;i++) {
             val = val * i;
         }
         return val;
     }

     public static int factorialRecur(int n) {

         if (n <= 1) {
             return 1;
         }

         return (n * factorialRecur(n-1));
     }
}
