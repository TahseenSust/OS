
package javaapplication4;


public class Atm4 extends Thread{
    BankBalance balance;
    Atm4(BankBalance balance)
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
