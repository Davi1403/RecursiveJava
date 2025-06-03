public class Ex21 {
    public int maior(int i, int[] v){
        if (i == v.length-1){
            return v[i];
        }else {

            if (v[i] > maior(i+1,v)){
                return v[i];
            }
            else return maior(i+1,v);
        }
    }

    public static void main(String[] args) {
        Ex21 aux = new Ex21();
        int[] v = {6,200,5,100,1,40};
        System.out.println(aux.maior(0,v));
    }
}
