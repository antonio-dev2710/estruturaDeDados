package EstruturaBase.pilhas.testes;

import EstruturaBase.pilhas.Pilha;

public class Teste15 {
    public static void main(String[] args) {
        //integer classe warraper representa o tipo primitivo do java
        Pilha<Integer> pilha =new Pilha<Integer>();
        System.out.println(pilha);
        System.out.println(pilha.tamanho());
        System.out.println(pilha.estaVazia());

        for(int i =1 ; i<=10; i++){
            try {
                pilha.empilha(i);
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }
        System.out.println(pilha);
        System.out.println(pilha.tamanho());
        System.out.println(pilha.estaVazia());
        
    }
}
