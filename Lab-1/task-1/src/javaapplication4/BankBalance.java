
package javaapplication4;


public class BankBalance {
    int balance=100000;
    public synchronized void cut(int tk)
    {
        if(balance-tk>=0)
            
        {
            balance-=tk;
            System.out.println(Thread.currentThread().getName()+" withdraw "+tk);
        }
        else
        {
            System.out.println("TAKA NAI");
        }
        System.out.println("BALANCE "+balance);
    }
}
