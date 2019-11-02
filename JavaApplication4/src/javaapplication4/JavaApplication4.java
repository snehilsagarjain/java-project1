/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

/**
 *
 * @author snehi
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    int fun(int  x)
          {  int p2=1,i;
            for(i=1;i<=x;i++)
            {
                if(i==1)
                    p2=1;
                else
                    p2*=2;
            }
            return p2;
        };
    public static void main(String[] args) {
        // TODO code application logic here
        int sum =0;
        int a=100;
        int b=101;
        int count=0;
        do
        {
            count++;
            int rem = a%10;
            a=a/10;
            sum+= fun(count)*rem;
        }while(a!=0);
        
    }
    
        
}
