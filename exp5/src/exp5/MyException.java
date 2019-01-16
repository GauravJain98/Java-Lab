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
class MyException extends Exception{
	
	String a;
	MyException(String b){
		
		a=b;
	}
	
	public String toString() {
		return("Exception:"+ a);
	}
}