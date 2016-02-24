package main.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneNumbers {

	 // Number-to-letter mappings in order from zero to nine
  
    
    private static String mappings1[] = {" "," ","A","D","G","J","M","P","T", "W"};
            

    private static String generateCombosHelper(String phone) {
    	String prefix ="";
        while (phone.length() > 0) {
        	 int digit = Integer.parseInt(phone.substring(0, 1));
        	 prefix= prefix + mappings1[digit];
        	 phone= phone.substring(1);
        } 
        return prefix;
    }

    private static String generateCombos(String phoneNumber) {
       
        String phoneWords =  generateCombosHelper(phoneNumber);

        return phoneWords;
    }

    public static void main(String[] args) throws IOException {
        String phone = "1234567890";
        
        List<String> myList = matchingPhoneWords(phone);
        
       
   }

	public static List<String> matchingPhoneWords(String phone) throws FileNotFoundException {
		List<String> myList = new ArrayList<String>();		
        
        String filename = (String)   System.getProperty("user.home")+"\\test.txt";
        
        String phoneWords = generateCombos(phone);
        
        System.out.println(phoneWords);       

        char [] comboarray =phoneWords.toLowerCase().toCharArray();
        
        for (int i=0; i < comboarray.length; i++)
        {
        	 Scanner input = new Scanner(new File(filename));
        	  while (input.hasNext()) {
	              String next = input.next().toLowerCase();
	              if (next.startsWith(""+comboarray[i]))
	              {
	            	  myList.add(next);
	              }
        	  }
        	  input.close();
        }
		return myList;
	}
   
}
