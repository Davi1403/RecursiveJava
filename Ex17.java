public class Ex17 {
    public int F(int N){
        if (N < 4) return 3*N;
        else return 2 * F(N - 4) + 5;
    }

    public static void main(String[] args) {
        Ex17 aux = new Ex17();

        System.out.print("F(3) = ");
        System.out.println(aux.F(3));
        System.out.print("F(7) = ");
        System.out.println(aux.F(7));
    }

}
