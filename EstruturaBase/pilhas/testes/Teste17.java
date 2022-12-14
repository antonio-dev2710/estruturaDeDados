package EstruturaBase.pilhas.testes;

import EstruturaBase.pilhas.Pilha;

public class Teste17 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        try {
            pilha.empilha(1);
            pilha.empilha(2);
            pilha.empilha(3);

            System.out.println(pilha);


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{
            pilha.desempilha();
            System.out.println(pilha);
        }
    }
    
}
