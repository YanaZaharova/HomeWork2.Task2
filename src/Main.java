public class Main {
    public static void main(String[] args) {

        int currentBalance = 300;
        int replenishment = 1200;

        int bonus = currentBalance / 100 + replenishment / 100;
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