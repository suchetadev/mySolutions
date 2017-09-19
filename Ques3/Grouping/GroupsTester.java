package Grouping;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * JUnit test cases for Groups.java
 */

public class GroupsTester {

	Groups myObject;
	
	@Before
	public void setUp() throws Exception {
		myObject = new Groups();
	}

	@Test
	public void testGetSum() {
		
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(5);
		input.add(6);
		input.add(1);
		
		int sum = myObject.getSum(input);
		
		Assert.assertEquals(18, sum);
		
	}
	
	//test for number of group, k = 1
	@Test
	public void testSeperate1(){
		
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(5);
		input.add(6);
		input.add(1);
		
		Assert.assertTrue(myObject.seperate(input, 1));
		
		
	}
	
	//test for number of input elements < no of groups condition
	@Test
	public void testSeperate2(){
		
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(5);
		input.add(6);
		input.add(1);
		
		Assert.assertFalse(myObject.seperate(input, 7));
		
	}
	
	//test for different values of k
	@Test
	public void testSeperate3(){
		
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(5);
		input.add(6);
		input.add(1);
		
		//k = 2
		Assert.assertTrue(myObject.seperate(input, 2));
		
		//k = 3
		Assert.assertTrue(myObject.seperate(input, 3));
		
		//k = 4
		Assert.assertFalse(myObject.seperate(input, 4));
		
		//k = 5
		Assert.assertFalse(myObject.seperate(input, 5));
		
		//k = 6
		//Assert.assertTrue(myObject.seperate(input, 6));
	}
	

}
