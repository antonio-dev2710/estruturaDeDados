package EstruturaBase.pilhas.exercicioPilha;

import java.util.Stack;

public class desafio7 {
    public static void main(String[] args) {
        String numeroTexto = transformarBina(25);

        System.out.println(numeroTexto);
        Integer num = 0;
        num = num.parseInt(numeroTexto);
        System.out.println("convertendo para numero...");
        System.out.println(num);
    }

    static String converterNum = "";

    public static String transformarBina(int num) {
        System.out.println("Transformando em binário...");

        Stack<Integer> stack = new Stack<>();
        Integer binario = 0;
        System.out.println("Decimal e binario");
        while (num >= 1) {

            binario = num % 2;
            num = num / 2;

            stack.push(binario);

        }

        while (!stack.isEmpty()) {
            converterNum += "" + stack.pop();

        }

        return converterNum;
    }

    // não precisou utilizar
    public static String formataDados(String dado) {
        dado = dado.replaceAll(",", "");
        dado = dado.replaceAll("\\[", "");
        dado = dado.replaceAll("\\]", "");
        return dado += "";
    }

}
