// author : Vaibhav Jindal

package Assign3;

import java.util.Scanner;

public class StringProcessing {
	
	// function for returning out no of words in the string
	public static int wordCount(String input){
		int counter = 0;
		for(int i=0; i<=input.length()-1; i++) {
		    if(Character.isLetter(input.charAt(i))){
		    	counter++;
		    	for( ; i <= input.length()-1 ; i++){
		    		if(input.charAt(i)==' '){
		    			counter++;
		    		}
		    	}                
		    }
		}
		
		return counter;
	}
	
	// function to convert upper case to lower case and visa versa
	public static void caseConversion(String input){
		StringBuilder sb = null;
		for(int i=0; i<=input.length()-1; i++) {
		    if(Character.isLetter(input.charAt(i))){
		        sb = new StringBuilder(input);
		    	for (int index = 0; index < sb.length(); index++) {
		    	    char c = sb.charAt(index);
		    	    if (Character.isLowerCase(c)) {
		    	        sb.setCharAt(index, Character.toUpperCase(c));
		    	    } else {
		    	        sb.setCharAt(index, Character.toLowerCase(c));
		    	    }
		    	}
		    }
		} 
		
		System.out.println("case converted string is : " +  sb);
	}
	
	//function to count number of special character in a string	
	public static int specialCharCount(String input){
		int count = 0;
		int total = input.length();
		for(int i=0; i<=input.length()-1; i++) {
		    if(Character.isLetter(input.charAt(i))){
		    	input = input.replaceAll("\\$","");
		    	input = input.replaceAll("\"","");
		    	input = input.replaceAll(":","");
		    	input = input.replaceAll("@","");
		    	input = input.replaceAll("!","");
		    	input = input.replaceAll("\\”","");
		    	input = input.replaceAll("\\“","");
		    	input = input.replaceAll("#","");
		    }
		}
		count = total - input.length();
		return count;
	}
	
	// count number of spaces in a string
	public static int spaceCount(String input){
		int spaceCount = 0;
		for (char c : input.toCharArray()) {
		    if (c == ' ') {
		         spaceCount++;
		    }
		}
		return spaceCount;
	}
	
	//function for string reversal
	public static String reversal(String input){	
		String reverse = "";
		int length = input.length();
	    for ( int i = length - 1 ; i >= 0 ; i-- ){
	    	reverse = reverse + input.charAt(i);
	    }
	    return reverse;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string : ");
		String input = s.nextLine();
		System.out.println();
		System.out.println("number of words in the string are : " + wordCount(input));
		caseConversion(input);
		System.out.println("number of special char in the string are : " + specialCharCount(input));
		System.out.println("number of spaces in the string are : " + spaceCount(input));
		System.out.println("reversed string is : " + reversal(input));

	}
}
