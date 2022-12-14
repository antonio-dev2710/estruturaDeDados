package vetorTeste;

import exerciciosVetores.VetorObjeto;

public class Teste10 {
    public static void main(String[] args) {
        VetorObjeto vetorObjeto = new VetorObjeto(3);

        // Contatos
        Contato c1 = new Contato("Contato1", "71948-47939", "contato1@gmail.com");
        Contato c2 = new Contato("Contato2", "34565-340245", "contato2@gmail.com");

        Contato c3 = new Contato("Contato3", "23435-059356", "contato3@gmail.com");
        Contato c4 = new Contato("Contato1", "71948-47939", "contato1@gmail.com");

        try {
            // método adicionar
            vetorObjeto.adicionarElmentos(c1);
            vetorObjeto.adicionarElmentos(c2);
            vetorObjeto.adicionarElmentos(c3);
            // método buscar
            //o c4 é adicionado mesmo tando em endereço de memória diferente pois apresenta os mesmos atributo do objeto "c1" dessa forma sobre escrevendo 
            int pos = vetorObjeto.buscar(c4);
            if (pos > -1) {
                System.out.println("Elemento encontrado: "+pos);
                
            }
            else{
                System.out.println("Elemento não encontrado");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(vetorObjeto);

    }

}
