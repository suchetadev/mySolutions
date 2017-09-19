package SingleLinkedList;

/*
 * Reverse contents of single linked list
 * 
 * Time complexity : O(N) where N is the size of linked list
 * 					 We are traversing linked list once and reversing it, so time complexity is O(N)
 * 
 * Space complexity : O(1) 
 * 					  Here we are using three extra pointers every time, so space complexity is O(1)	
 * 
 */

public class SingleLinkedList {
	
	public Node createLinkedList(int[] inputData) {
		Node head = null;
		Node currentNode = null;
		
		for (int i = 0; i < inputData.length; i++) {
			
			Node tempNode = new Node(inputData[i]);
			
			if (i == 0) {
				currentNode = tempNode;
				head = currentNode;
			}
			else {
				
				currentNode.setNext(tempNode);
				currentNode = tempNode;
			}
		}
		
		return head;
	}
	
	public int getListLength(Node head){
		int counter = 0;
		Node currentNode = head;
		
		while(currentNode != null){
			counter++;
			currentNode = currentNode.getNext();
		}
		return counter;
		
	}
	
	public String toString(Node head){
		
		Node currentNode = head;
		String list = ""; 
		while(currentNode != null){
			list = list + " " + currentNode.getData();
			currentNode = currentNode.getNext();
		}
		return list;
	}

	public Node reverse(Node head){
		
		Node previous = null;
		Node current = head;
		Node temp = null;
		
		while(current != null) {
			temp = current.getNext();
			current.setNext(previous);
			previous = current;
			current = temp;
		}
		head = previous;
		
		return head;
	}
	
	public static void main(String args[]) {
		
		int[] inputData = {1, 3, 5, 7, 9};
		SingleLinkedList obj = new SingleLinkedList();
		
		Node head = obj.createLinkedList(inputData);
	
		System.out.println("List before reverse : ");
		System.out.println(obj.toString(head));
		
		System.out.println("List after reverse : ");
		Node head1 = obj.reverse(head);
		System.out.println(obj.toString(head1));
		
	}
	
}
