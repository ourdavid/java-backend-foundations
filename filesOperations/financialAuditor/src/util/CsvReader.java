package util;

import entitites.Values;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public static List<Values> readCsv(String path) {
        List<Values> values = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                String date = fields[0];
                String description = fields[1];
                if (fields.length <3){
                    continue;
                }
                try {
                    Double amount = Double.parseDouble(fields[2]);
                    values.add(new Values(date,description,amount));
                } catch (Exception e) {
                    System.out.println("Error parsing amount: " + e.getMessage());
                }

                line = br.readLine();
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return values;
    }
}
