package main.java;

import java.util.List;
/*
 * Write a java program with reverses the words in a String. Use whatever features you feel will solve this problem 

clearly and efficiently. This is the template of the program:
 */
public class ReverseWords3a {

	public static String reverse(String string) {
	    if (string.isEmpty()) {
	        return string;
	    }
	    int last = string.length();
	    StringBuilder sb = new StringBuilder(string.length());
	    boolean space = ' ' == string.charAt(string.length() - 1);
	    for (int i = string.length() - 1; i >= 0; i--) {
	        if (space != (string.charAt(i) == ' ')) {
	            sb.append(string.substring(i + 1, last));
	            last = i + 1;
	            space = !space;
	        }
	    }
	    sb.append(string.substring(0, last));
	    return sb.toString();
	}
	
	 public static void main(String[] args) {
	        String sentence = "THIS IS A   STRING";
	       String reversed = reverse( sentence) ;  
	       System.out.println(reversed);
	 }    
	    
}
