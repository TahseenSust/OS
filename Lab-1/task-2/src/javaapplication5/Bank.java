
package javaapplication5;

import java.util.concurrent.locks.ReentrantLock;


public class Bank {
    int balance=100000;
    private final ReentrantLock reLock = new ReentrantLock(true);
    
    public void cut(int tk)
    {
        reLock.lock();
        try{
            if(balance-tk>=0)
                balance-=tk;
        }finally{
            reLock.unlock();
        }
    }
}
