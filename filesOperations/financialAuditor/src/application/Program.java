package application;

import entitites.Values;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String path = "/home/david/transactions.csv";
        String exit = "/home/david/transactions2.csv";

        List<Values> values = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            line = br.readLine();

            while (line != null){
                String[] columns = line.split(",");
                String date = columns[0];
                String Description = columns[1];
                try {
                    double amount = Double.parseDouble(columns[2]);
                    values.add(new Values(date,Description,amount));
                } catch (NumberFormatException e) {
                    System.out.println("Warning: Found a bad number, skipping line..."+ e.getMessage());
                }

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Critical Error: The file does not exist!");
        }

        double totalBalance = 0;
        for (Values value : values){
            System.out.println(value);
            totalBalance += value.getAmount();
        }

        System.out.println("Total Balance: $"+String.format("%.2f",totalBalance));

        try(BufferedWriter bf = new BufferedWriter(new FileWriter(exit,true))){
            for(Values value : values){
                bf.write(String.valueOf(value));
                bf.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: not found");
        }
        sc.close();
    }
}
