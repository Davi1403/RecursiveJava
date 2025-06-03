public class Ex19 {

    public void p (String prefixo, String restante){
        if (restante.length() == 0){
            System.out.println(prefixo);
        }else {
            for (int i=0 ; i<restante.length() ; i++){
                char atual = restante.charAt(i);
                String novoPrefixo = prefixo + atual;
                String novoRestante = restante.substring(0,i) + restante.substring(i + 1);
                p(novoPrefixo,novoRestante);
            }
        }

    }

    public static void main(String[] args) {
        Ex19 p = new Ex19();
        p.p("", "ABC");

    }
}
