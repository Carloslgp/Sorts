package InsertionSort;

import MyArrayList.MyArrayList;

public class SortingAlgorithm {
    public SortingAlgorithm(){}
    public void insertionSort(MyArrayList<Integer> list){

        for (int i = 1; i < list.length(); i++) {

            for (int j = i; j > 0; j--) {

                if (list.get(j) < list.get(j - 1)) {


                    swap(list, j, j - 1);

                } else {

                    break;
                }
            }
        }
    }


    private void swap(MyArrayList<Integer> list, int indice1, int indice2){
        Integer temp = list.get(indice1);
        list.set(indice1, list.get(indice2));
        list.set(indice2, temp);
    }

    public void quickSort(MyArrayList<Integer> list){
        quickSort(list, 0, list.length() - 1);
    }


    private void quickSort(MyArrayList<Integer> list, int left, int right){
        if (left < right) {
            int pivotIndex = partition(list, left, right);


            quickSort(list, left, pivotIndex - 1);


            quickSort(list, pivotIndex + 1, right);
        }
    }


    private int partition(MyArrayList<Integer> list, int left, int right){
        int pivot = list.get(right);
        int i = left - 1;

        for (int j = left; j < right; j++){
            if (list.get(j) <= pivot){
                i++;
                swap(list, i, j);
            }
        }


        swap(list, i + 1, right);
        return i + 1;
    }


    public void bubbleSort(MyArrayList<Integer>  lista){
        if (lista.length() <= 1){
            System.out.println("Lista muito curta para ordenar");
            return;
        }

        bubbleSort(lista, lista.length());
    }



    private void  bubbleSort(MyArrayList<Integer>  lista, int comprimento){
        if (comprimento == 1) return;

        boolean trocou = false;
        for(int i = 0; i < comprimento - 1; i++){
            if(lista.get(i) > lista.get(i+1)){
                Integer temp = lista.get(i+1);
                lista.set(i + 1, lista.get(i));
                lista.set(i, temp);
                trocou = true;
            }
        }

        if (!trocou) return;
        bubbleSort(lista, comprimento - 1);
    }

}
