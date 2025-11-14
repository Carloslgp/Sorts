package InsertionSort;

import MyArrayList.MyArrayList;

public class SortingAlgorithm {
    public SortingAlgorithm(){}
    public void insertionSort(MyArrayList<Integer> list){
        // Não precisamos de 'atual' ou 'ultimoOrdenado' aqui fora

        // 1. Começamos o loop de fora no SEGUNDO elemento (índice 1)
        //    (Assumimos que o primeiro elemento, índice 0, já está "ordenado")
        for (int i = 1; i < list.length(); i++) {

            // 2. O 'j' é o índice do elemento que vamos "empurrar" para a esquerda
            //    Começa em 'i' e vai diminuindo
            for (int j = i; j > 0; j--) {

                // 3. Comparamos o elemento 'j' com o elemento ANTERIOR 'j-1'
                if (list.get(j) < list.get(j - 1)) {

                    // 4. Se 'j' for menor, trocamos ele de lugar com 'j-1'
                    //    Precisamos de um swap que receba ÍNDICES
                    swap(list, j, j - 1);

                } else {
                    // 5. Se 'j' for MAIOR ou IGUAL,
                    //    significa que ele achou seu lugar.
                    //    Podemos parar o loop 'j' e ir para o próximo 'i'.
                    break;
                }
            }
        }
    }

    // Certifique-se que seu swap receba dois ÍNDICES
    private void swap(MyArrayList<Integer> list, int indice1, int indice2){
        Integer temp = list.get(indice1);
        list.set(indice1, list.get(indice2));
        list.set(indice2, temp);
    }

    public void quickSort(MyArrayList<Integer> list){
        quickSort(list, 0, list.length() - 1);
    }

    // QuickSort recursivo
    private void quickSort(MyArrayList<Integer> list, int left, int right){
        if (left < right) {
            int pivotIndex = partition(list, left, right);

            // Ordena a parte da esquerda
            quickSort(list, left, pivotIndex - 1);

            // Ordena a parte da direita
            quickSort(list, pivotIndex + 1, right);
        }
    }

    // Particiona o array e retorna a posição do pivô
    private int partition(MyArrayList<Integer> list, int left, int right){
        int pivot = list.get(right); // pivô = último elemento
        int i = left - 1;

        for (int j = left; j < right; j++){
            if (list.get(j) <= pivot){
                i++;
                swap(list, i, j);
            }
        }

        // Coloca o pivô na posição correta
        swap(list, i + 1, right);
        return i + 1;
    }

}
