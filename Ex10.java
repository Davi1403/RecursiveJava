public class Ex10 {
    public double somaImpares(int n){

        if (n == 1) return 1    ;
        else {
            return (2 * n - 1) + somaImpares(n - 1);
        }
    }

    public static void main(String[] args) {
        Ex10 aux = new Ex10();

        System.out.println(aux.somaImpares(5    ));
    }
}
