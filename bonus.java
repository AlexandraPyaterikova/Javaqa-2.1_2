public class Main {
    public static void main(String[] args) {
        int income = 20;
        int balance = 300;
        int bonus;
        if (income >= 1000) {
            bonus = income / 100 * 1;
        } else {
            bonus = 0;
        }
        int totalbalance = income + bonus + balance;


        System.out.println("bonus: " + bonus);
        System.out.println("totalbalance: " + totalbalance);
    }
}