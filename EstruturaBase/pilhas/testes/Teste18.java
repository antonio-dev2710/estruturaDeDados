package EstruturaBase.pilhas.testes;

import java.util.Stack;

public class Teste18 {
    public static void main(String[] args) {
        //Stack
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(30);
        stack.push(25);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        //espiar o ultimo elemnto do vetor
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());

        System.out.println(stack);
        //determina quantas posições faltam pra chegar no topo
        System.out.println(stack.search(1));



    }
}
