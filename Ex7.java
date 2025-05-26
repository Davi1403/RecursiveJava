public class Ex7 {
    public int h(int m, int n){
        if (n==1) return m+1;
        if (m==1) return n+1;

        return h(m,n-1) + h(m-1,n);
    }

    public static void main (String[] args){
        Ex7 obj = new Ex7();

        System.out.println(obj.h(3,4));
    }
}
