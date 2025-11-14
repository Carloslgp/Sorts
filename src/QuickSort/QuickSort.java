package QuickSort;

import MyArrayList.MyArrayList;

public class QuickSort {

    public QuickSort(){}

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

    private void swap(MyArrayList<Integer> list, int indice1, int indice2){
        Integer temp = list.get(indice1);
        list.set(indice1, list.get(indice2));
        list.set(indice2, temp);
    }
}
