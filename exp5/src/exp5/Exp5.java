/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp5;

/**
 *
 * @author ks834
 */
import java.util.*;
public class Exp5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		int bal,amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the balance:");
		bal=sc.nextInt();
		System.out.println("Enter the withdrawl amount:");
		amt=sc.nextInt();
		
		try {
			
			bal=bal-amt;
			if(bal<0)
				throw new MyException("Insufficient Balance");
			System.out.println("Remaining Balance"+ bal);
		}
		
		catch(MyException e) {
			
			System.out.println(e);
		}
		
	}
    }
    

