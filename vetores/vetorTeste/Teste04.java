package vetorTeste;

import exerciciosVetores.Vetor;

public class Teste04 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        try {
            vetor.adicionarElmentos("add elemento 01");
            vetor.adicionarElmentos("add elemento 02");
            vetor.adicionarElmentos("add elemento 03");
            vetor.adicionarElmentos("add elemento 04");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
    }

}
