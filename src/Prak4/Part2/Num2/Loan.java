package Prak4.Part2.Num2;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    public Loan(double annualInterestRate,
                int numberOfYears, double loanAmount) {
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount(loanAmount);
    }

    public double getAnnualInterestRate() { return annualInterestRate; }
    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("Процентная ставка должна быть положительной");
        }
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() { return numberOfYears; }
    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears <= 0) {
            throw new IllegalArgumentException("Срок кредита должен быть положительным");
        }
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() { return loanAmount; }
    public void setLoanAmount(double loanAmount) {
        if (loanAmount <= 0) {
            throw new IllegalArgumentException("Сумма кредита должна быть положительной");
        }
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * 12 * numberOfYears;
    }
}