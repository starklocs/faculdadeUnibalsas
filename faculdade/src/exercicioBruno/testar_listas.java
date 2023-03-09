package Listas;


public class testar_listas {
    public static void main(String[] args) {

        listaSequencial lista = new listaSequencial();
        //lista.inserirElemento(20);
        
        listaSequencial lista1 = new listaSequencial(); 
		
		lista.inserirElemento(42);
		lista.inserirElemento(99);
		lista.inserirElemento(77);
        System.out.println("A lista esta cheia "+lista.estaCheia());
        System.out.println("A lista esta Vazia "+lista.estaVazia());
        
        lista.remover(100);
        //lista.apaga(1);
        lista.inserirElemento(3,7);
		
        System.out.println("Elementos "+lista.imprimirLista());
    }
}
