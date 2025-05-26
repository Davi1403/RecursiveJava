public class Ex13 {
    public int fatorial(int n){
        if (n == 1) return 1;
        else {
            return n * fatorial(n-1);
        }
    }

    public int f(int x){
        if (x%3 == 0) return x * x;
        if (x%3 == 1) return x + 3;
        if (x%3 == 2) return fatorial(x);
        else return 0;
    }

    public static void main (String[] args){
        Ex13 aux = new Ex13();

        System.out.println(aux.f(5));
    }
}
