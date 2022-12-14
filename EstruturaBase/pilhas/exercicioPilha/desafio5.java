package EstruturaBase.pilhas.exercicioPilha;

import java.util.Scanner;
import java.util.Stack;

public class desafio5 {
    public static void main(String[] args) {
        Stack<Character> palidromo = new Stack<Character>();
        String nome = "MARIA";

        int total=0;

        for (int i = 0; i < nome.length(); i++) {
            // o metodo charAt eu obetenho determina palavra em relação a sua posição na
            // classe caracter
            System.out.println("Digite uma letra:");
            System.out.println(palidromo.push(nome.charAt(i)));

        }
        total = palidromo.size();
        System.out.println("O total é: " + total);

        for (int i = 0; i < (palidromo.size() / 2); i++) {

            if (!(palidromo.get(i).equals(palidromo.get((total - 1) - i)))) {

                System.out.println(palidromo.get(i) + "!= " + palidromo.get((total - 1) - i));
                // desempilhar
                while (!palidromo.isEmpty()) {
                    System.out.println(palidromo.pop());
                }
                System.out.println("Não é um polindromo!!");
                System.exit(i);
            }
            System.out.println(palidromo.get(i) + " = " + palidromo.get((total - 1) - i));
        }
        System.out.println("É UM PALIDROMO!!");
    }
}
