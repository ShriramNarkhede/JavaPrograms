class fact2 {

      static int calcfactorial(int n) {

            if (n == 1 && n==1) {
                   return 1;

            } else {
                 return n * calcfactorial(n - 1);
            }

      }

      public static void main(String args[]) {

            int n = 5;

            int ans = calcfactorial(n);

            System.out.println(ans);

      }
}