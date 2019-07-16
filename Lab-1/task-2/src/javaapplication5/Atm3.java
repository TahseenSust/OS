
package javaapplication5;


public class Atm3 extends Thread {
    Bank balance;
    Atm3(Bank balance)
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
