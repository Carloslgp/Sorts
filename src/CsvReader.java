import MyArrayList.MyArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {

    public static MyArrayList<Integer> carregarCsv(String caminho) {
        MyArrayList<Integer> lista = new MyArrayList<Integer>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;

            while ((linha = br.readLine()) != null) {

                String[] valores = linha.split(",");

                for (String v : valores) {
                    v = v.trim();

                    if (!v.matches("-?\\d+")) {
                        continue;
                    }

                    lista.add(Integer.parseInt(v));
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return lista;
    }
}