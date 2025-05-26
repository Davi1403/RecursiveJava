import java.util.Scanner;

public class Ex3 {
    public int potencia(int base, int expoente){
        if (expoente == 0) return 1;
        else {
            return base * potencia(base, expoente - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex3 p = new Ex3();

        System.out.print("BASE: ");
        int base = sc.nextInt();
        System.out.print("EXPOENTE: ");
        int expoente = sc.nextInt();

        System.out.printf("POTENCIA DE BASE %d E EXPOENTE %d = ",base,expoente);
        System.out.print(p.potencia(base,expoente));
    }
}
