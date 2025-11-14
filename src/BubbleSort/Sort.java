package BubbleSort;

import MyArrayList.MyArrayList;

public class Sort {
    public MyArrayList<Integer> bubbleSort(MyArrayList<Integer>  lista){
        if (lista.length() <= 1){
            System.out.println("Lista muito curta para ordenar");
            return lista;
        }

        return bubbleSort(lista, lista.length());
    }



    private MyArrayList<Integer>  bubbleSort(MyArrayList<Integer>  lista, int comprimento){
        if (comprimento == 1) return lista;

        boolean trocou = false;
        for(int i = 0; i < comprimento - 1; i++){
            if(lista.get(i) > lista.get(i+1)){
                Integer temp = lista.get(i+1);
                lista.set(i + 1, lista.get(i));
                lista.set(i, temp);
                trocou = true;
            }
        }

        if (!trocou) return lista;
        return bubbleSort(lista, comprimento - 1);
    }
}
