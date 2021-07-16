public class savingsAccount {
    int balance;
public savingsAccount(int initialBalance){
    balance = initialBalance;
}
public void checkBalance () {
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
}
    public void checkBalancee (){
        System.out.println("Your balance is " + balance);
}
public void deposit (int amountToDeposit){
    balance = amountToDeposit + balance;
    System.out.println("you just deposited " + amountToDeposit);
}
public int withdraw (int amountToWithdraw){
    balance = balance - amountToWithdraw;
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
}
public String toString (){
    return "This is a savings account with " + balance + " saved.";
}
public static void main (String[] args){
    savingsAccount savings = new savingsAccount(2000);;
            savings.checkBalance();
            savings.withdraw(300);
            savings.checkBalancee();
            savings.deposit(600);
            savings.checkBalancee();
            savings.deposit(600);
            savings.checkBalancee();
            System.out.println(savings);
}
}
