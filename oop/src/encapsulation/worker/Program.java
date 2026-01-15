package encapsulation.worker;

import encapsulation.worker.entities.Department;

import encapsulation.worker.entities.HourContract;
import encapsulation.worker.entities.Worker;
import encapsulation.worker.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = input.nextLine();

        System.out.println("Enter worker data:");

        System.out.print("Name: ");
        String workerName = input.nextLine();
        System.out.print("Level: ");
        String workerLevel = input.nextLine();
        System.out.print("Base salary: ");
        double workerBaseSalary = Double.parseDouble(input.nextLine());

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),workerBaseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker?");
        int contractsNumber = Integer.parseInt(input.nextLine());

        for (int i = 0; i < contractsNumber; i++){
            System.out.printf("Enter contract #%d data: \n",i+1);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contracDate = sdf.parse(input.nextLine());
            System.out.print("Value per hour: ");
            double valuePerHour = Double.parseDouble(input.nextLine());
            System.out.print("Duration (hours): ");
            int valueDurationHour = Integer.parseInt(input.nextLine());

            HourContract contract = new HourContract(contracDate,valuePerHour,valueDurationHour);
            worker.addContract(contract);

        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String incomeCalculate = input.nextLine();
        int incomeCalcualteMoth = Integer.parseInt(incomeCalculate.substring(0,2));
        int incomeCalcualteYear = Integer.parseInt(incomeCalculate.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());

        System.out.println("Income for "+ incomeCalcualteMoth + "/" + incomeCalcualteYear + " : " + String.format("%.2f",worker.income(incomeCalcualteMoth,incomeCalcualteYear)));











    }
}
