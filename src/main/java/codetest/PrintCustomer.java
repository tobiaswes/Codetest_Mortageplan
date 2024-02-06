package codetest;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PrintCustomer {
    private List<Customer> customers;
    MortgageCalculator mortgageCalculator = new MortgageCalculator();

    public void setCustomers(List<Customer> customers){
        this.customers = customers;
    }
    public void print(){
        customers.forEach(customer -> {
            String monthlyPayment = mortgageCalculator.calcMonthlyPayment(
                    customer.getTotalLoan(),
                    customer.getInterest(),
                    customer.getYears()
            );
            System.out.println(customer.getName() + " wants to borrow " +
                    customer.getTotalLoan() + " € for a period of " +
                    customer.getYears() + " years and pay " +
                    monthlyPayment + " € each month");
        });
    }
}
