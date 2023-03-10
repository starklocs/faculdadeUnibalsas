package lista1s.tasks;

public class atividadeAvaliativa3 {
    public static void main(String[] args) {
        int [] lista1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int [] lista12 = {16,17,18,19,20,21,22,23,24,25,26,27,28,30};
        int [] lista13 = new int [lista1.length+lista12.length];

    for (int i=0;i<lista1.length;i++){
        lista13[i] = lista1[i];

    }
    int index2 = lista1.length;
    for (int i =0; i <lista12.length; i++) {
        lista13[index2] = lista12[i];
        index2++;
    }
    for (int i=0; i <lista13.length; i++) {
        System.out.println(lista13[i]);
    }

    }

}
