public class BankAccount {
    private int balance = 100;

    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " Attempting to Withdraw " + amount);
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() +  " Completed Withdrawal");
        }else{
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }
}
