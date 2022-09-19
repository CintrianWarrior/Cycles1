public class Main {
    public static void main(String[] args) {
        int monthlyDeposit = 29000;
        int totalDeposit = 0;
        for (int i = 1; i<=12; i++) {
            totalDeposit = totalDeposit + monthlyDeposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalDeposit + " рублей");
    }
    }
}