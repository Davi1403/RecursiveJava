public class Ex5 {
        public int ff (int n){
            if (n == 1) return 1;
            if (n % 2 == 0) return ff(n/2);
            return ff((n-1)/2) + ff((n+1)/2);
        }
        public static void main (String[] args){
            Ex5 test = new Ex5();
            System.out.println(test.ff(7));
        }
    }

