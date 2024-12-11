public class Main {
    public static void main(String[] args) {

        int currentBalance = 100;
        int replenishment = 1100;

        int bonus = replenishment / 100;
        int finalBalance = currentBalance + replenishment;

        if (finalBalance > 1000) {
            int balanceWithBonus = finalBalance + bonus;
            System.out.println("Итоговый баланс: " + balanceWithBonus);
            System.out.println("Бонус: " + bonus);
        } else {
            System.out.println("Итоговый баланс: " + finalBalance);
            System.out.println("Бонус: 0");
        }
    }
}