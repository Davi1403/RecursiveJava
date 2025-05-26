public class Ex8 {
    public int mdc(int x, int y){
        if (x == y) return x;
        if (y>x) return mdc(y,x);
        else {
            return mdc(x-y,y);
        }
    }

    public static void main(String[] args) {
        Ex8 mdc = new Ex8();

        System.out.println(mdc.mdc(10,15));
    }
}
