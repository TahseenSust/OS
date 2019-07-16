/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author IICT (SWE)
 */
public class JavaApplication4 {

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        BankBalance balance = new BankBalance();
        Atm1 atm1=new Atm1(balance);
        Atm2 atm2=new Atm2(balance);
        Atm3 atm3=new Atm3(balance);
        Atm4 atm4=new Atm4(balance);
        atm1.start();
        atm2.start();
        atm3.start();
        atm4.start();
        atm1.join();
        atm2.join();
        atm3.join();
        atm4.join();
        
        System.out.println("Total Balance = "+balance.balance);
        
    }
    
}
