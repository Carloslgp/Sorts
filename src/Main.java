import MyArrayList.MyArrayList;


public class Main {
    public static void main(String[] args) {
        String caminho = "conjuntosDeDados/decrescente_10000.csv";

        MyArrayList<Integer> lista = CsvReader.carregarCsv(caminho);


        lista.bubbleSort();

        System.out.println("Depois do sort:");
        lista.print();
    }
}
