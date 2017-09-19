package SingleLinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * JUnit test cases for SingleLinkedList.java
 */


public class SingleLinkedListTester {

	SingleLinkedList myList;
	
	@Before
	public void setUp() throws Exception {
	    myList = new SingleLinkedList();
	}
	
	@Test
	public void testGetListLength() {
		
		int[] inputData = {};
		Node head = myList.createLinkedList(inputData);
		
		int length = myList.getListLength(head);
		Assert.assertEquals(0, length);
		
		int[] inputData1 = {5, 7, 9};
		Node head1 = myList.createLinkedList(inputData1);
		
		int length1 = myList.getListLength(head1);
		Assert.assertEquals(3, length1);
		
	}
	
	@Test
	public void testCreateLinkedList() {
	
		int[] inputData = {};
		Node head = myList.createLinkedList(inputData);
		
		int lengthBeforeAdd = myList.getListLength(head);
		Assert.assertEquals(0, lengthBeforeAdd);
		
		
		int[] inputData1 = {1, 3, 5, 7, 9};
		Node head1 = myList.createLinkedList(inputData1);
		
		int lengthAfterAdd = myList.getListLength(head1);
		Assert.assertEquals(5, lengthAfterAdd);
		
		
	
	}
	
	@Test
	public void testToString() {
	
		int[] inputData = {1, 3, 5, 7, 9};
		Node head = myList.createLinkedList(inputData);
		
		String actual = myList.toString(head);
		Assert.assertEquals(" 1 3 5 7 9", actual);
	}
	
	@Test
	public void testReverse() {
		
		int[] inputData = {1, 3, 5, 7, 9};
		Node head = myList.createLinkedList(inputData);
		
		Node head1 = myList.reverse(head);
		String actual = myList.toString(head1);
		Assert.assertEquals(" 9 7 5 3 1", actual);
		
		int[] inputData2 = {5, 2, 4, 1};
		Node head2 = myList.createLinkedList(inputData2);
		
		Node head3 = myList.reverse(head2);
		String actual3 = myList.toString(head3);
		Assert.assertEquals(" 1 4 2 5", actual3);
		
		
	}
	

}
