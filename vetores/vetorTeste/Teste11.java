package vetorTeste;

import exerciciosVetores.Lista;

public class Teste11 {
    public static void main(String[] args) {

        // Configurar tipo dinamicamente
        Lista<String> lista = new Lista<String>(2);
        Lista<Contato> contato = new Lista<Contato>(2);
        Contato c1 = new Contato("Contato1", "71948-47939", "contato1@gmail.com");
        Contato c2 = new Contato("Contato2", "34565-340245", "contato2@gmail.com");

       


       
        try {
            // método adicionar
            // O java aceita elementos de tipo diferente mas array armazena apenas valores
            // do mesmo tipo pois declaramos o atributo com Object
            lista.adicionarElmentos("add elemento Tipo String");
            lista.adicionarElmentos("1");
            contato.adicionarElmentos(c1);
            contato.adicionarElmentos(c2);

            

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(lista);
        System.out.println(contato);

    }

}
