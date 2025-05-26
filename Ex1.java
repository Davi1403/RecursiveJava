public class Ex1 {
    public int misterio(int a, int b){
        if (b == 1) return a;
        else return a + misterio(a, b-1);
    }

    public static void main(String[] args){
        Ex1 m = new Ex1();
        System.out.println(m.misterio(3,8));
    }
}
