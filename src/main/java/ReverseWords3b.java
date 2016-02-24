package main.java;

/*
 * Write the same program as above, but now the function will work over a single char array, swapping characters 

within the array to achieve the same word reversal. Your function CANNOT use any built in Java methods and 

CANNOT allocate any free store (no use of the new keyword). Your function can allocate as many primitive 

variables as your function needs to provide this functionality. This is the template of this program:
 */
public class ReverseWords3b { 

public static void main(String[] args) throws Exception 
{ 

	ReverseWords3b rw = new ReverseWords3b(); 
	
	char[] input = {'T','h','i','s',' ','i','s',' ','a',' ','t','e','s','t'}; 
	
	rw.reverseWords(input); 
	
	System.out.println(new String(input)); 

}
//Your code here
	public char[] reverseWords(char[] input) 
	{ 
		int begin=0;
	    int end=input.length-1;
	    char temp;
	    while(end>begin){
	        temp = input[begin];
	        input[begin]=input[end];
	        input[end] = temp;
	        end--;
	        begin++;
	    }
	    return input;
	}

}

