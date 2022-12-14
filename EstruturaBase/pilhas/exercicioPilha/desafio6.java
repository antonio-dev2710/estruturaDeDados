package EstruturaBase.pilhas.exercicioPilha;

import java.util.Stack;

public class desafio6 {
    public static void main(String[] args) {
        boolean expressaoMat=verificarExpressao("(A+B) OU A+B(");
        System.out.println("Verificando expressão!");
        System.out.println(expressaoMat);

        try {
            confirma(expressaoMat);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }
    private static void confirma(boolean verificar) throws Exception {
        if(verificar){
            System.out.println("Tudo ok");
        }
        else{
            throw new Exception("Algo de errado na sua equação, tente novamente");
        }
        
    }

    public static boolean verificarExpressao(String expressao)  {
        // verificar se as quantidade de sinais são pares
        int sinalDireito=0;
        int sinalEsquerdo=0;
        char sinalEsq='(';
        char sinalDir=')';

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expressao.length(); i++) {
            System.out.println("Salvando letras dentro da pilha: ");
            System.out.println(stack.push(expressao.charAt(i)));
            if (stack.get(i).equals(sinalDir)) {
                sinalDireito++;
            }
            if (stack.get(i).equals(sinalEsq)) {
                sinalEsquerdo++;

            }
            
        }
         if(sinalDireito%2==0&&sinalEsquerdo%2==0){
                
            return true;
        }
        return false;
    }

}
