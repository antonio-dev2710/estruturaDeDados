package exerciciosVetores;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import vetorTeste.Contato;

public class Lista<T> {
    // Será utilizado um recurso no java chamado generics onde nos podemos na
    // declaração da nossa lista podemos passar qual o tipo de classe q esse vetor
    // deve trabalhar <(T-tipo)(>- operador daimond ")
    private T[] elementos;
    private int tamanho = 0;
    private int num;
    Scanner scan = new Scanner(System.in);

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
    }

    // instanciando um vetor generico no java
    // Atreves da API reflection que deixa vc acessar dinamicamente as classes que
    // vc tem no seu projeto
    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
    }

    public void adicionarElmentos(T elemento) throws Exception {
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

    public Object listarContatos() {
        Contato[] contato = new Contato[this.elementos.length];
        tamanho = elementos.length;
        int aumentar = 6;

        for (int i = 0; i < aumentar; i++) {
            Contato c = new Contato();
            System.out.println("Digete nome");
            String nome = scan.next();
            c.setNome(nome);

            System.out.println("Digete telefone");
            String telefone = scan.next();
            c.setTelefone(telefone);

            System.out.println("Digete email");

            String email = scan.next();
            c.setEmail(email);
            if (i == tamanho) {
                Contato[] novoContao = new Contato[this.tamanho * 2];
                for (int aux = 0; aux < this.tamanho; aux++) {
                    novoContao[aux] = contato[aux];
                }
                contato = novoContao;
            }
            contato[i] = c;
        }
        elementos = (T[]) contato;
        return elementos;

    }

    int aux = 0;
    private T elemento;

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

    public Object buscar(int posicao) throws Exception {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Está fora do intervalo");
        }
        return this.elementos[posicao];

    }

    // Verificar se elemento existe, reescrevendo o método buscar
    public int buscar(T elemento) {
        // algoritmo de busca sequencial
        // trabalhando com o tamanho real do vetor
        // equal vai funcionar indente do tipo do elemento
        for (int i = 0; i < this.tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        // é uma posição que não existe dentro nosso vertor
        return -1;
    }

    // busca contains
    public boolean buscarElemnto(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if ((elementos[i].equals(elemento))) {
                return true;
            }
        }
        return false;
    }

    public Object obtem(int posicao) throws Exception {
        for (int i = 0; i < this.tamanho; i++) {
            if (i == posicao) {

                return elementos[i];
            }
        }
        throw new Exception();

    }

    public void limpar() {
        this.num = this.tamanho;
        tamanho = 0;
    }

    public int ultimoIndice(T elemento) {

        int num = 0;
        int aux = 0;
        for (int i = 0; i < this.tamanho; i++) {
            if ((elementos[i].equals(elemento))) {
                num = i;
                aux++;

            }
        }
        if (aux != 0) {
            return num;
        }
        return -1;
    }

    // primeiro eu tenho que pegar a posiçao do elemento
    // remover o elemente e retornar o elemento removido
    public Object remove(T elemento) {
        int pos = -1;
        for (int i = 0; i < this.tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                pos = i;
                break;
            }

        }
        if (pos != -1) {
            for (int i = pos; i < this.tamanho; i++) {
                this.elementos[i] = this.elementos[i + 1];

            }
            tamanho--;
            return elemento;
        }
        return false;
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
