package exerciciosVetores;

import vetorTeste.Contato;

public class questaoVetores {
    public static void main(String[] args) {
        Lista<String> lista= new Lista<String>(10);
        try {
            lista.adicionarElmentos("a");
            lista.adicionarElmentos("b");
            lista.adicionarElmentos("c");
            lista.adicionarElmentos("b");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Questão 1");

        System.out.println(lista);
        boolean existe = lista.buscarElemnto("a");
        System.out.println(existe);

        System.out.println("Questão 2");
        int ultimoDaLista= lista.ultimoIndice("b");
        System.out.println(ultimoDaLista);

        System.out.println("Questão 3");
        System.out.println(lista.remove("b"));

        System.out.println("Questão 4");
        try {
            System.out.println(lista.obtem(1));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Questão 5");
        //limpar
        lista.limpar();
       System.out.println(lista);

       //Questão 06
        //capacidade de 4
        //setar os contatos
        // aumentar a capacidade
        System.out.println("Questão 6");
       Lista<Contato> contato =new Lista<Contato>(4);
      contato.listarContatos();
      System.out.println(contato);
      

    }

}
