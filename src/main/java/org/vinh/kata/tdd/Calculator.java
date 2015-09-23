package org.vinh.kata.tdd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
		if (null == param || param.isEmpty()){
			return 0;
		}
		if (param.length() == 1){
			return Integer.valueOf(param);
		}
		String[] listTokens = param.split("[//,;\\n]");
		List<Integer> listInt = Arrays.stream(listTokens).map(Integer::valueOf).collect(Collectors.toList());

		return listInt.stream().mapToInt(Integer::intValue).sum() ;
	}
}
