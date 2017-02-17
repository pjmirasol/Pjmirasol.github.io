/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author m304user
 */
import java.util.Scanner;
public class CSE13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("What is your name? ");
        String name=input.nextLine();
        
        System.out.println("What is your age? ");
        int age = input.nextInt();
        input.nextLine();
        
       System.out.println("What degree are you taking? ");
       String course = input.nextLine();
       
       System.out.println("What is your major?");
       String major = input.nextLine();
       
       System.out.println("Welcome "+ name);
       System.out.println("You are "+ age);
       System.out.println("Your degree and major is: "+course+" "+major);
    }
    
    
    
    
    
}