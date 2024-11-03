public class Bank{
    static int currentBalance = 2000;
    public static void greetCustomer(){
        System.out.println("Hello, Welcome to the Banking Application");
    }
    public void deposit(int amount){
        currentBalance = currentBalance + amount;
        System.out.println("Amount is Deposited Successfully");


    }
    public static void  withdrawal(int amount){
        currentBalance = currentBalance - amount;
        System.out.println("Amount is Withdrawal Successfully");


    }
    public  int getCurrentBalance(){
        return currentBalance;

    }
    public static void main(String[] args){
        Bank bank = new Bank();
        greetCustomer();
        System.err.println(" Current Balance is :" + bank.getCurrentBalance());
        bank.deposit(584);
        System.out.println(" Current Balance is :" + bank.getCurrentBalance());
        withdrawal(356);
        System.out.println(" Current Balance is :" + bank.getCurrentBalance());
    }


}
