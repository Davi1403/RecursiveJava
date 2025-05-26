public class Ex6 {
    public int fusc(int n, int profund){
        int i;
        for (i = 0; i < profund; i++) {
            System.out.print("...");
        }
        System.out.println("fusc(" + n + ", " + profund + ")");
        if (n == 1) return 1;
        if (n % 2 == 0) return fusc(n/2, profund+1);
        return fusc((n-1)/2, profund+1) + fusc((n+1)/2, profund+1);
    }
    public static void main(String[] args){
        Ex6 f = new Ex6();
        System.out.println(f.fusc(7,0));
    }
}
