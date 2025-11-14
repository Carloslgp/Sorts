import MyArrayList.MyArrayList;
import BubbleSort.Sort;
import QuickSort.*;


public class Main {
    public static void main(String[] args) {
        String caminho = "conjuntosDeDados/decrescente_10000.csv";

        MyArrayList<Integer> lista = CsvReader.carregarCsv(caminho);


        System.out.println("Dados carregados:");
        lista.print();


        long inicio = System.nanoTime();

        lista.quickSort();

        long fim = System.nanoTime();

        long tempoGasto = fim - inicio;


        System.out.println("\nTempo total (ms): " + tempoGasto / 1_000_000.0);

        System.out.println("Depois do sort:");
        lista.print();
    }
}
