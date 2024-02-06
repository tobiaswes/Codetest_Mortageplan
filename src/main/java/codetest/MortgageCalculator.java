package codetest;

import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
@Component
public class MortgageCalculator {

    public String calcMonthlyPayment(double totalLoan, double interest, int years){

        double monthlyInterest = interest / 12 / 100;
        int totalPayments = years * 12;

        double power = Pow.powerFunction(1+ monthlyInterest,totalPayments);

        double monthlyPayment = totalLoan * (monthlyInterest * power) / (power - 1);

        double roundedMonthlyPayment = Round.roundFunction(monthlyPayment);

        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        return decimalFormat.format(roundedMonthlyPayment);
    }
}
