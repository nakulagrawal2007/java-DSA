import java.util.Scanner;

class salarycalculator {


    static double calculateSalary(double basicSalary) {
        double hra, da, finalAmount, pf=0;

        if (basicSalary >= 30000) {
            hra = basicSalary * 20/100;
            da = basicSalary * 15/100;
        }
        else {
            hra = basicSalary * 15/100;
            da = basicSalary * 8/100;
            pf = basicSalary * 12/100;
        }

        return finalAmount = basicSalary + hra + da - pf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        double netSalary = 

        calculateSalary(basicSalary);

        System.out.println("Net Salary = " + netSalary);


    }
}
