package vetorTeste;

import exerciciosVetores.Vetor;

public class Teste07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        try {
            vetor.adicionarElmentos("b");
            vetor.adicionarElmentos("c");
            vetor.adicionarElmentos("e");
            vetor.adicionarElmentos("f");
            vetor.adicionarElmentos("g");
            System.out.println(vetor);
            vetor.adicionarElmentos(0, "a");
            System.out.println(vetor);
            vetor.adicionarElmentos(3, "d");
            System.out.println(vetor);


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       

      
    }

}
