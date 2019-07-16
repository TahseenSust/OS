
package javaapplication5;


public class Atm2 extends Thread {
    Bank balance;
    Atm2(Bank balance)
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
