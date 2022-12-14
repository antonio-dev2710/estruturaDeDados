package EstruturaBase.pilhas.exercicioPilha;

import java.util.Scanner;

import EstruturaBase.pilhas.Livro;
import EstruturaBase.pilhas.Pilha;

public class questao3 {
    public static void main(String[] args) {
        
        Pilha<Livro> livro = new Pilha<Livro>(20);

        Scanner scan = new Scanner(System.in);

        for(int i =0; i<6;i++){
            Livro l = new Livro();
            System.out.println("Digite o nome do livro");
            l.setNome(scan.nextLine());
            
            System.out.println("Digite o autor do livro");
            l.setAutor(scan.nextLine());
            System.out.println("Digite o isbn do livro");
            l.setIsbn(scan.nextLine());
            System.out.println("Digite o ano de lançamento do livro");
            l.setAno(scan.nextLine());

            try {
                livro.empilha(l);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Lista de livros registrados");
        System.out.println(livro);
        
    }
}
