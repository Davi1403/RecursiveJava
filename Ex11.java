public class Ex11 {
    public int mod(int n, int m){
        if (n < m) return n;
        else{
            return mod(n - m , m);
        }
    }

    public static void main(String[] args){
        Ex11 aux = new Ex11();

        System.out.println(aux.mod(27, 4));
    }
}
