package codetest;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader();

        List<Customer> customers = fileReader.read("prospects.txt");

        PrintCustomer printCustomer = new PrintCustomer();

        printCustomer.setCustomers(customers);

        printCustomer.print();





    }
}