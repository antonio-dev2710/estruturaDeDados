package vetorTeste;

import exerciciosVetores.Vetor;

public class Teste08 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        try {
            vetor.adicionarElmentos("b");
            vetor.adicionarElmentos("c");
            vetor.adicionarElmentos("e");
            vetor.adicionarElmentos("f");
            vetor.adicionarElmentos("g");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(vetor);
    }

}
