
package javaapplication5;


public class Atm1 extends Thread {
    Bank balance;
    Atm1(Bank balance)
    {
        this.balance=balance;
    }
    @Override
    public void run()
    {
        int n;
        n=100000;
        balance.cut(n);
        
    }
}
