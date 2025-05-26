public class Ex12 {
    public String hex(int n){
        if (n<=16) {
            return String.valueOf(n);}
        else {
            int resto = n%16;
            char charHex = ' ';
            if (resto>9){
                charHex = (char) ('A' + resto - 10);
            }else {
                charHex = (char) n;
            }

            return String.valueOf(hex(n/16) + charHex);
        }
    }



    public static void main (String[] args){
        Ex12 aux = new Ex12();

        System.out.println(aux.hex(1789));

    }
}
