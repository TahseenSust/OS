/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

public class Atm1 extends Thread {
    BankBalance balance;
    Atm1(BankBalance balance)
    {
        this.balance=balance;
    }
    @Override
    public void run()
    {
        int n;
        n=500;
        balance.cut(n);
        
    }
}
