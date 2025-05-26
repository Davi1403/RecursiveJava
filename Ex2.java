import java.sql.SQLOutput;

public class Ex2 {
    public int soma(int n){
        if (n == 0) return 0;
        else return n + soma(n-1);
    }

    public static void main(String[] args){
        Ex2 s = new Ex2();
        int n = 4;
        System.out.print("SOMA DE 0 ATE " + n + " = ");
        System.out.print(s.soma(n));
    }
}
