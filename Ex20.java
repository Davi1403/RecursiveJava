public class Ex20 {
    public void gerarSeq(String seq, int A, int B){
        if (A == 0 && B == 0){
            System.out.println(seq);
        }else {
            if (A > 0){
                gerarSeq(seq + "A" , A-1, B);
            }
            if (B > 0){
                gerarSeq(seq + "B", A, B-1);
            }
        }
    }


    public static void main(String[] args) {
        Ex20 g = new Ex20();
        g.gerarSeq("", 3, 1); // Exemplo: 3 gols para A, 1 para B
    }
    }


