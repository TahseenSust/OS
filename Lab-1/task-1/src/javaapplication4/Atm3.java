
package javaapplication4;


public class Atm3 extends Thread{
    BankBalance balance;
    Atm3(BankBalance balance)
    {
        this.balance=balance;
    }
    @Override
    public void run()
    {
        int n;
        n=1000;
        balance.cut(n);
    }
}
