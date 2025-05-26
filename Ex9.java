public class Ex9 {
    public int nx (int n , int x){
        if (x == 0) return 0;
        else {
            return n + nx(n, x-1);
        }
    }

    public static void main (String[] args){
        Ex9 aux = new Ex9();

        System.out.println(aux.nx(21,3));
    }
}
