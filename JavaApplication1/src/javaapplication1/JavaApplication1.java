/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author snehi
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double amount,principle=1000,rate=10,time=3,ci;			
	
	System.out.println("principle= "+principle);
 
	System.out.println("rate="+rate);
 
	System.out.println("time="+time);
 
	amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
 
	System.out.println("amount="+amount);
 
	ci=amount-principle;
 
	System.out.println("compound interest="+ci);
    }
    
}
