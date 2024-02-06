package codetest.controller;

import codetest.Customer;
import codetest.FileReader;
import codetest.MortgageCalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {


    private final MortgageCalculator mortgageCalculator;
    private List<Customer> customers;

    @Autowired
    public UserController(FileReader fileReader, MortgageCalculator mortgageCalculator) {
        this.mortgageCalculator = mortgageCalculator;
        this.customers = fileReader.read("prospects.txt");
    }


    @GetMapping("/customers")
    public String displayCustomers(Model model) {

        customers.forEach(customer -> {
            String monthlyPayment = mortgageCalculator.calcMonthlyPayment(
                    customer.getTotalLoan(),
                    customer.getInterest(),
                    customer.getYears()
            );

            customer.setMonthlyPayment(monthlyPayment);
        });

        model.addAttribute("customers", customers);

        return "customer-list";
    }
    @PostMapping("/addcustomer")
    public String addCustomer(@RequestParam String name,
                              @RequestParam double totalLoan,
                              @RequestParam double interest,
                              @RequestParam int years,
                              Model model){

        Customer newCustomer = new Customer(name, totalLoan, interest, years);
        String monthlyPayment = mortgageCalculator.calcMonthlyPayment(newCustomer.getTotalLoan(),
                newCustomer.getInterest(),
                newCustomer.getYears());
        newCustomer.setMonthlyPayment(monthlyPayment);

        customers.add(newCustomer);

        model.addAttribute("customers", customers);

        return "redirect:customers";
    }
}
