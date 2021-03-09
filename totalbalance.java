public class Main {
    public static void main(String[] args) {
    int income = 20;
    int balance = 300;
    int totalbalance;
    if (income >= 1000) {
   totalbalance = income + income / 100 * 1 + balance;
}
else {
totalbalance = balance + income;
}
System.out.println(totalbalance);}
}