package codetest;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader();

        MortgageCalculator mortgageCalculator = new MortgageCalculator();

        List<Customer> customers = fileReader.read("prospects.txt");

        customers.forEach(customer -> {
            String monthlyPayment = mortgageCalculator.calcMonthlyPayment(
                    customer.totalLoan(),
                    customer.interest(),
                    customer.years()
            );
            System.out.println(customer.name() + " wants to borrow " +
                    customer.totalLoan() + " € for a period of " +
                    customer.years() + " years and pay " +
                    monthlyPayment + " € each month");
        });



    }
}