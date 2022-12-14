package EstruturaBase.pilhas.exercicioPilha;

import java.util.Scanner;

import EstruturaBase.pilhas.Pilha;

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pilha<Integer>pilha= new Pilha<Integer>();
        int num=0;

        for(int i =1; i<=10;i++){
            System.out.println("Digite um número");
            num = scan.nextInt();
            if(!(num%2==0)){
                
                pilha.desempilha();
            }

            else{
                try {
                    pilha.empilha(num);
                    System.out.println("Valor salvo!");
                    System.out.println(pilha);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

           
        }
        System.out.println(pilha);
        if(!pilha.estaVazia()){
            int aux =pilha.tamanho();
            
            for( int i=0;i<aux;i++){
                System.out.println(pilha.desempilha());
            }
         }

    }
}
