/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

/**
 *
 * @author snehi
 */
import java.
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double amount,principle=1000,rate=10,time=3,ci,n,x,y,w;			
	//System.out.println("principle= "+principle);
	//System.out.println("rate="+rate);
	//System.out.println("time="+time);
        y=rate/100;
        x=1+y;
        w=n*time;
	amount=principle*(pow(x,w));
	//System.out.println("amount="+amount);
	ci=amount-principle;
	System.out.println("compound interest="+ci);
    }
    
}
