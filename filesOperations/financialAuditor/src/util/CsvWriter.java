package util;

import entitites.Values;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

public class CsvWriter {

    public static void writeCsv(String path, List<Values> lines) {
       try(BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(path))){
           for (Values line : lines) {
               bw.write(String.valueOf(line));
               bw.newLine();
           }
       }catch (IOException e){
           System.out.println("Error: " + e.getMessage());
       }

    }
}
