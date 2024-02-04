package codetest;

import java.text.DecimalFormat;

public class MortgageCalculator {
    private Pow pow = new Pow();
    private Round round = new Round();
    public String calcMonthlyPayment(double totalLoan, double interest, int years){

        double monthlyInterest = interest / 12 / 100;
        int totalPayments = years * 12;

        double power = pow.powerFunction(1+ monthlyInterest,totalPayments);

        double monthlyPayment = totalLoan * (monthlyInterest * power) / (power - 1);

        double roundedMonthlyPayment = round.roundFunction(monthlyPayment);

        DecimalFormat decimalFormat = new DecimalFormat("#.00");

        return decimalFormat.format(roundedMonthlyPayment);
    }
}
