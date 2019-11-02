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
public class pascal {
     
//Java program to print Pascal's Triangle of a given size.
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
static int factorial(int n)
{   
    int fact = 1;
    int i;
    for(i=1; i<n; i++)
    {
        fact*=i;
    }
    return i;
    }
    // Function to display the pascal triangle
    static void display(int n) 
    {
        int i;
        int coefficient;
        int line;
        for(line=1;line<=n;line++)
        {
            for(i=0;i<=line;i++)
            {
                System.out.print((factorial(line)/factorial(line-i) * factorial(i)) + " ");
            }
            System.out.println();
        }
    }
    // main Function to read user input
    public static void main(String[] args){  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the size");
        try {
            n = Integer.parseInt(br.readLine());
        }
        catch(Exception e){
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("The Pascal's Triangle is");
        display(n);
    }
}

}
