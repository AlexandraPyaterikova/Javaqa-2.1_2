public class BonusBalance {
    public static void main(String[] args) {
        int income = 20;
        int balance = 300;
        int bonus;
        if (income >= 1000) {
            bonus = income / 100;
        } else {
            bonus = 0;
        }
        int totalbalance = income + bonus + balance;


        System.out.println("Bonus: " + bonus);
        System.out.println("Total Balance: " + totalbalance);
    }
}
