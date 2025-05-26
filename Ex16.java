public class Ex16 {
    public double S (double n){
        if (n == 1) {
            System.out.println(" 1 = ");
            return 1;
        }
        if (n%2 == 0) {
            System.out.print(1/n + " + ");
            return -1.0 / n + S(n-1);
        }else{
            System.out.print(1/n + " - ");
            return 1.0 / n + S(n - 1);
        }
    }

    public static void main(String[] args) {
        Ex16 aux = new Ex16();

        System.out.println(aux.S(5));
    }
}
