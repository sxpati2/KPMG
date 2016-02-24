package main.java;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testPhoneNumbers {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() throws FileNotFoundException
	{
		PhoneNumbers pn = new PhoneNumbers();
	   
	   String[] expecteds = {"dummy","test"};
	   assertArrayEquals("Test Passed", expecteds , pn.matchingPhoneWords("1234567890").toArray());
	      
	}
	@Test
	public void test2() throws FileNotFoundException
	{
		PhoneNumbers pn = new PhoneNumbers();
	   
	   String[] expecteds = {"zimmer","test"};
	   assertArrayEquals("Test Failed", expecteds , pn.matchingPhoneWords("1234567890").toArray());
	      
	}
	@Test
	public void test3()
	{
		ReverseWords3a rw = new ReverseWords3a();
	   
	   String expecteds ="STRING A IS THIS";
	   assertEquals("Test Passed", expecteds , rw.reverse("THIS IS A STRING"));
	      
	}
	@Test
	public void test4()
	{
		ReverseWords3b rw = new ReverseWords3b();
	   
		char[] input = {'T','h','i','s',' ','i','s',' ','a',' ','t','e','s','t'}; 
		char[] expecteds = {'t','s','e','t',' ','a',' ','s','i',' ','s','i','h','T'};
	   assertEquals("Test Passed", expecteds , rw.reverseWords(input));
	   System.out.println(expecteds);
	   System.out.println(rw.reverseWords(input));
	      
	}
	

}
