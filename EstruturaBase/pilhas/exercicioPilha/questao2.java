package EstruturaBase.pilhas.exercicioPilha;

import java.util.Scanner;

import EstruturaBase.pilhas.Pilha;

public class questao2 {
    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();
        Scanner scan = new Scanner(System.in);
        int num = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um número:");
            num = scan.nextInt();
            if (num == 0) {
                if (par.estaVazia() || par.estaVazia())
                    ;
                else {
                    par.desempilha();
                    impar.desempilha();
                }

            }
            if (num % 2 == 0) {
                try {

                    par.empilha(num);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else {
                try {
                    impar.empilha(num);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }
        System.out.println("Desempilha par: ");
        System.out.println(par);
        System.out.println(" ");
        System.out.println("Desempilha impar: ");
        System.out.println(impar);

    }
}
