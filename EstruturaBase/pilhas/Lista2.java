package EstruturaBase.pilhas;

import EstruturaBase.BaseEstatica;

public class Lista2<T> extends BaseEstatica<T> {

    public Lista2(){
        super();
    }
    public Lista2(int capacidade){
        super(capacidade);
    }
    protected boolean adicionarElmentos(T elemento) throws Exception{
        //esse metodos vão chamar os métodos da superClasse(BaseEstatica.java)
        return super.adicionarElmentos(elemento);
    }
    public boolean adicionarElmentos(int posicao, T elemento) {
        return super.adicionarElmentos(posicao, elemento);

    }
}
