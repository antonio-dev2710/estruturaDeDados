package exerciciosVetores;


import java.util.ArrayList;

import vetorTeste.Contato;

public class arrayList {
    public static void main(String[] args) {
         ArrayList<Object> contatos = new ArrayList<Object>();
        Lista listanContato = new Lista<>(6);
        listanContato.listarContatos();
        System.out.println(listanContato.toString());
        
        System.out.println("Lista de contatos dentro da API Array list");
        System.out.println( contatos.add(listanContato.toString()));
       
    }
}
