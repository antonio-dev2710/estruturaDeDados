package EstruturaBase.pilhas.exercicioPilha;

import java.util.Scanner;
import java.util.Stack;

import EstruturaBase.pilhas.Livro;

public class questao4 {
    public static void main(String[] args) {
         Stack<Livro> stack = new Stack<Livro>();
         Scanner scan = new Scanner(System.in);

         for(int i = 0 ;i<3;i++){
            Livro livro = new Livro();
            System.out.println("Digite o nome do livro");
           livro.setNome(scan.nextLine());
            
            System.out.println("Digite o autor do livro");
           livro.setAutor(scan.nextLine());
            System.out.println("Digite o isbn do livro");
           livro.setIsbn(scan.nextLine());
            System.out.println("Digite o ano de lançamento do livro");
           livro.setAno(scan.nextLine());
           stack.push(livro);
           System.out.println("Livro salvo com sucesso!!");

         }
         System.out.println("Livros registrados");
         System.out.println(stack);

    }
}
