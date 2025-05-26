public class Ex14 {
    public int puzzle(int base, int limit)
    {
//base and limit are nonnegative numbers
        if ( base > limit ) return -1;
        else if ( base == limit ) return 1;
        else return base * puzzle(base + 1, limit);
    }

    public static void main(String[] args) {
        Ex14 aux = new Ex14();

        System.out.print("puzzle(14,10)");
        System.out.println(aux.puzzle(14,10));
        System.out.print("puzzle(4,7)");
        System.out.println(aux.puzzle(4,7));
        System.out.print("puzzle(0,0)");
        System.out.println(aux.puzzle(0,0));

    }
}
