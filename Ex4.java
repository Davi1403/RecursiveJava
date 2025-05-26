public class Ex4 {
    public int repiticao(int a, int b){

        int soma = a;

        for (int i = 0; i < b ; i++){
            soma ++;
        }
        return soma;
    }

    public int recursiva(int a, int b){
        if (b == 0) return a;
        else{
            return recursiva(++a, --b);
        }
    }

    public static void main(String[] args) {
        Ex4 r = new Ex4();

        System.out.println(r.repiticao(10,5));
        System.out.println(r.recursiva(10,5));
    }
}

