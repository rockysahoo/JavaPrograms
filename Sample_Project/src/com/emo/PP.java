package com.emo;

public class PP {

	public static void main(String[] args) {
		
		//String input="";
		String input="01801\r\n" + 
				"01802\r\n" + 
				"01821\r\n" + 
				"04039\r\n" + 
				"04044\r\n" + 
				"04049\r\n" + 
				"04059\r\n" + 
				"04087\r\n" + 
				"04090\r\n" + 
				"04091\r\n" + 
				"04093\r\n" + 
				"04094\r\n" + 
				"06110\r\n" + 
				"06149\r\n" + 
				"06625\r\n" + 
				"10863\r\n" + 
				"10884\r\n" + 
				"";
		
<<<<<<< HEAD
		
		
=======
>>>>>>> branch 'master' of https://github.com/rockysahoo/JavaPrograms.git
		input=input.trim();
		input=input.replaceAll(" ", "");
		input=input.replaceAll("\\r\\n", "','");
		
		System.out.println(input);

	}

}
