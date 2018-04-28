package com.mavendemoexample;

/**
 * Author: Raja 
 *
 */
public class App {
	
	public String reverseString(String src) {
		return new StringBuilder(src).reverse().toString();
	}
	
    public static void main(String[] args) {
    	final String str = "Hello Jenkins with Maven Build tool!";
    	
        App appObject = new App();
        System.out.println("The reverse string of \"" + str + "\" is \"" + appObject.reverseString(str) + "\"");
    }
}
