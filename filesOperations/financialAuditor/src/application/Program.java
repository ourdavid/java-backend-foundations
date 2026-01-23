package application;

import entitites.Values;
import util.CsvWriter;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        String inputPath = "/home/david/teste.csv";
        String outputPath = "/home/david/teste2.csv";

        try {
            List<Values> values = util.CsvReader.readCsv(inputPath);

            double total = 0.0;
            for (Values v : values) {
                System.out.println(v);
                total += v.getAmount();
            }

            System.out.println("Total Amount: $" + String.format("%.2f", total));

            CsvWriter.writeCsv(outputPath,values);

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
