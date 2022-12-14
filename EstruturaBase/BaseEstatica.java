package EstruturaBase;

import java.lang.reflect.Array;

public class BaseEstatica<T> {
    // parametrizar com o argumento generico
    protected T[] elementos;
    protected int tamanho = 0;

    public BaseEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public BaseEstatica() {
        this(10);
    }

    public boolean estaVazia() {

        return this.tamanho == 0;

    }

    // instanciando um vetor generico no java
    // Atreves da API reflection que deixa vc acessar dinamicamente as classes que
    // vc tem no seu projeto
    public BaseEstatica(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
    }

    protected boolean adicionarElmentos(T elemento) throws Exception {
        this.aumentaCapacidade();
        if (this.tamanho < elementos.length) {
            this.elementos[tamanho] = elemento;
            this.tamanho++;
            return true;

        } else {
            throw new Exception("vetor já está cheio n é possível add novos elementos");
        }

    }

    public boolean adicionarElmentos(int posicao, T elemento) {
        // verificar se a posicao é valida
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Está fora do intervalo");
        }
        this.aumentaCapacidade();
        // mover todo os elementos
        // B G D E F + + -> posição ser adiconada;
        // 0 1 2 3 4 -> tamanho é 5;
        // vetor[2] = vetor[1];
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        // atribuir o elemento para posição
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    protected void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elemeNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elemeNovos[i] = this.elementos[i];

            }
            this.elementos = elemeNovos;
        }
    }

    public int tamanho() {

        return this.tamanho;
    }

    // concatenação de string simples pode não ser um jeito eficenite
    @Override
    public String toString() {
        // deixar mais eficente utilizando a classe string builder;
        StringBuilder s = new StringBuilder();
        // metodo para add informação
        s.append("[");
        for (int i = 0; i < (this.tamanho - 1); i++) {
            s.append(elementos[i]);
            s.append(",");
        }
        if (this.tamanho > 0) {
            s.append(elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();
    }

}
