public class Ex15 {
    public double sum (double n){
        if (n == 1) return 1;
        else{
            return 1/n + sum(n-1);
        }
    }

    public static void main(String[] args) {
        Ex15 aux = new Ex15();

        System.out.println(aux.sum(5));
    }
}
