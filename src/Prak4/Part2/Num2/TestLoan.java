package Prak4.Part2.Num2;

public class TestLoan {
    public static void main(String[] args) {
        try {
            // корректные данные
            Loan loan1 = new Loan(5.5, 10, 100000);
            System.out.println("Ежемесячный платеж: " + loan1.getMonthlyPayment());
            System.out.println("Общая сумма выплат: " + loan1.getTotalPayment());

            // некорректные данные (вызовет исключение)
            Loan loan2 = new Loan(-3.5, 5, 50000);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}