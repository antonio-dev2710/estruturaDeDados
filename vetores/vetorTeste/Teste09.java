package vetorTeste;

import exerciciosVetores.Vetor;

public class Teste09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        try {
            vetor.adicionarElmentos("b");
            vetor.adicionarElmentos("g");
            vetor.adicionarElmentos("d");
            vetor.adicionarElmentos("e");
            vetor.adicionarElmentos("f");
            System.out.println(vetor);
            int posicao=vetor.buscar("a");
            vetor.removerElementos(posicao);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(vetor.toString());
    }

}
