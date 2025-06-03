public class Ex18 {
    public void f(int i, int[] v){
        if (i >= v.length-1){
            return;
        }else {
            int j = i;
            int posMenor = i;

            while (j < v.length){
                if (v[j] < v[posMenor]){
                    posMenor = j;
                }
                j ++;
            }
            int aux = v[i];
            v[i] = v[posMenor];
            v[posMenor] = aux;

            f(i+1 , v);
        }
    }

    public static void main(String[] args) {
        Ex18 aux = new Ex18();
        int [] v = {4,3,10,1,5,3};
        aux.f(0,v);
        for (int i=0;i< v.length;i++){
            System.out.print(v[i] + " ");
        }
        }
    }

