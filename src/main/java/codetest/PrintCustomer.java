package codetest;

import java.util.List;

public class PrintCustomer {
    private List<Customer> customers;
    MortgageCalculator mortgageCalculator = new MortgageCalculator();

    public void setCustomers(List<Customer> customers){
        this.customers = customers;
    }
    public void print(){
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
