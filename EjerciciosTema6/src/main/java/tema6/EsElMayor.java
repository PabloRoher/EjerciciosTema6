package tema6;

public class EsElMayor {

    public int elMayor(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public int elMayor2(int a, int b){
        if (a > b){
            return 1;
        }else if (a < b){
            return -1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){

        EsElMayor mayor = new EsElMayor();
        System.out.println(mayor.elMayor(5, 3));
        System.out.println(mayor.elMayor2(5, 3));
    }
}
