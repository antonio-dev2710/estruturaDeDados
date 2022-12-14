package vetorTeste;

import java.util.ArrayList;

public class Teste12 {
    public static void main(String[] args) {
        // trabalhando com ArrayList
        // uma das classes mais utilizadas
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("a");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        arrayList.add("a");
        System.out.println(arrayList.indexOf("a"));
        System.out.println(arrayList.lastIndexOf("a"));

        System.out.println(arrayList);

        // adicionar através da posição
        arrayList.add(1, "b");

        // adicionar através do método de busca
        boolean existe = arrayList.contains("a");
        System.out.println(existe);

        // retorna a posição se houver o elemento vai retornar o index se n vai retornar
        // -1
        int pos = arrayList.indexOf("b");
        System.out.println(pos);

        // buscar por posição
        String buscaPos = arrayList.get(1);
        System.out.println(buscaPos);

        // remover poder ser pelo index ou pelo nome
        System.out.println(arrayList.remove("c"));
        // quantidade de elementos
        System.out.println(arrayList.size());

        var state = "abcdtmpefgtmp";
        int temp = state.indexOf("tmp"); // match first occurance
        System.out.println(temp);
        //4
        temp = state.lastIndexOf("tmp"); // match last occurance
        System.out.println(temp);
        // >10

        System.out.println(arrayList);
         // remover poder ser pelo index ou pelo nome
         System.out.println(arrayList.remove("a"));
        arrayList.clear();
         System.out.println(arrayList);

         

    }
}
