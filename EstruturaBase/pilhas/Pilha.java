package EstruturaBase.pilhas;

import EstruturaBase.BaseEstatica;

public class Pilha<T> extends BaseEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) throws Exception {
        super.adicionarElmentos(elemento);

    }
   

    //retirar o ultimo elemento do array
    public T desempilha(){
        if(estaVazia()){
            //não vai desimpelhar nda
            System.out.println("A pilha está vazia");
            return null;
        }
        T elemento = this.elementos[this.tamanho-1];
        this.tamanho--;
        return elemento;
    }

    public T topo() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[this.tamanho - 1];
    }

}
