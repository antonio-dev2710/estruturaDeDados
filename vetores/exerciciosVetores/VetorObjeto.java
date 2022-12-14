package exerciciosVetores;
import java.util.Arrays;

public class VetorObjeto {
    //deixar de forma mais genérica passando a classe mae object assim podendo receber qualquer valor 
    private Object[] elementos;
    private int tamanho = 0;

    public VetorObjeto(int capacidade) {
        this.elementos = new Object[capacidade];
    }

    

    public void adicionarElmentos(Object elemento) throws Exception {
        this.aumentaCapacidade();
        if (this.tamanho < elementos.length) {
            this.elementos[tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("vetor já está cheio n é possível add novos elementos");
        }

    }

    // vamos sobre carregar o método adicionarElementos modificando a sua assinatura
    // "overload"
    // Add elemento em qualquer posição
    public boolean adicionarElmentos(int posicao,Object elemento) {
        // verificar se a posicao é valida
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Está fora do intervalo");
        }
        this.aumentaCapacidade();
        // mover todo os elementos
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        // atribuir o elemento para posição
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    int aux = 0;

    public boolean removerElementos(int posicao) throws Exception {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Está fora do intervalo");
        }

        // B G D E F -> posição ser removida 1;
        // 0 1 2 3 4 -> tamanho é 5;
        // vetor[1] = vetor[2];
        for (int i = posicao; i < this.tamanho; i++) {

            this.elementos[i] = this.elementos[i + 1];

        }
        // 4
        this.tamanho--;
        return true;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object [] elemeNovos = new Object [this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elemeNovos[i] = this.elementos[i];

            }
            this.elementos = elemeNovos;
        }
    }

    public int tamanho() {

        return this.tamanho;
    }

    public Object buscar(int posicao) throws Exception {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Está fora do intervalo");
        }
        return  this.elementos[posicao];

    }

    // Verificar se elemento existe, reescrevendo o método buscar
    public int buscar(Object elemento) {
        // algoritmo de busca sequencial
        // trabalhando com o tamanho real do vetor
        //equal vai funcionar indente do tipo do elemento
        for (int i = 0; i < this.tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        // é uma posição que não existe dentro nosso vertor
        return -1;
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
