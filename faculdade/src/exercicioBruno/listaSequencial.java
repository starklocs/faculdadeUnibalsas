package Listas;

public class listaSequencial {
    private Integer[] elementos = new Integer[10];
    public int quantidadeElementos(){
        int quantidade = 0;
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] != null) {
                quantidade++;
            }
        }
        return quantidade;
    }
    public boolean estaCheia(){
        return quantidadeElementos() == elementos.length;
    }
    public boolean estaVazia(){
        return quantidadeElementos() == 0;
    }
    public void inserirElemento(Integer elemento){
        if(estaCheia()) return;
        
        Integer posicaoDisponivel = null;
        for (int i = 0; i < elementos.length; i++) {
            if(elementos[i] == null) {
                posicaoDisponivel = i;
                break;
            }
        }
        
        elementos[posicaoDisponivel] = elemento;
    }
    	public String imprimirLista() {
    		String valor = "";
    		for(int i=0; i<elementos.length; i++) {
    			if(elementos[i] != null) {
    				valor += elementos [i] +" ";
    		}
    			
    	}
    		return valor;
    }
    		
                
    	public void remover (int valor) {
    		for (int i=0; i<elementos.length; i++) {
    			if (elementos[i] == valor) {
    				elementos [i] = null;
    				break;
    			}
    			break;
    		}
    	}
    	
    	
    	public void apaga(int posicao) {
    		if (elementos.length < posicao) return; //VERIFICA POSICAO VALIDA ARRAY
    	    if (elementos[posicao] == null) return; //VERIFICA ELEMENTO ? APAGADO
    	    
    	    elementos[posicao] = null; //VALIDOU? ATRIBUI ELEMENTO NULL VAZIO
    	}
    	
    	public void inserirElemento(int posicao, Integer elemento) {
    		if (elementos.length < posicao) return; // VERIFICA POSICAO VALIDA
    	    if (elementos[posicao] != null) return; // TÁ VAZIA?
    	    
    	    // desloca elementos para abrir espaço na posição de inserção
    	    //for (int i = elementos.length - 2; i >= posicao; i--) {
    	        //elementos[i + 1] = elementos[i];
    	    //}
    	    elementos[posicao] = elemento; // insere o elemento na posição desejada
    	}
     }




