package codetest;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class FileReader {
    private List<Customer> customers;

    public FileReader(){
        customers = new ArrayList<>();
    }
    public List<Customer> read(String filename){

        InputStream inputStream = FileReader.class.getClassLoader().getResourceAsStream(filename);

        if (inputStream != null) {
            try (Scanner scanner = new Scanner(inputStream)) {
                boolean firstLine = true;

                while (scanner.hasNextLine()) {
                    if (!firstLine) {
                        String line = scanner.nextLine();
                        String[] fields = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                        if (fields.length == 4) {
                            String name = fields[0].trim();
                            double totalLoan = Double.parseDouble(fields[1].trim());
                            double interest = Double.parseDouble(fields[2].trim());
                            int years = Integer.parseInt(fields[3].trim());

                            Customer customer = new Customer(name, totalLoan, interest, years);

                            customers.add(customer);
                        } else {
                            // Handle the case where not all fields are present
                            System.err.println("Warning: Not all fields present in line: " + line);
                        }
                    } else {
                        scanner.nextLine();
                        firstLine = false;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("File not found!");
        }
        return customers;
    }
}
