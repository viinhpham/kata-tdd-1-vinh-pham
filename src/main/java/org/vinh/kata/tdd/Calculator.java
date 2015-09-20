package org.vinh.kata.tdd;

/**
 * @author Vinh Pham
 * @since 9/20/15.
 */
public class Calculator {

	private static Calculator instance;
	public  Calculator(){}
	public static Calculator getInstance(){
		if (null == instance){
			instance = new Calculator();
		}
		return instance;
	}
	public int add(String param){
		return 0;
	}
}
