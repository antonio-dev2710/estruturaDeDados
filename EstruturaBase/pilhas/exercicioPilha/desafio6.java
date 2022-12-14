package EstruturaBase.pilhas.exercicioPilha;

import java.util.Stack;

public class desafio6 {
    public static void main(String[] args) {
        boolean expressaoMat=verificarExpressao("(A+B) OU (A+B)");
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
    final static String ABRE ="([{";
    final static String FECHA =")]}";


    public static boolean verificarExpressao(String expressao)  {
        // verificar se as quantidade de sinais são pares
        int sinalDireito=0;
        int sinalEsquerdo=0;
        char simbolo,topo;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expressao.length(); i++) {
            System.out.println("Salvando letras dentro da pilha.. ");
        
            simbolo=expressao.charAt(i);
            if (ABRE.indexOf(simbolo)>-1) {
                stack.push(simbolo);
            }
            else if (FECHA.indexOf(simbolo)>-1) {
                if(stack.isEmpty()){
                 return false;

                }else{
                    topo=stack.pop();
                    if (ABRE.indexOf(topo)!=FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }

            }
            
        }
         
        return true;
    }

}
