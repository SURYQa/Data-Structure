package org.linkedlist;

public class LinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next; // next value for reference
		Node(int val){
			data = val ;
			next = null;
		}
	}
	LinkedList(){
		head = null;
	}
	public void insertAtBegining(int val) {
		
		Node newNode = new Node(val);
		
		//when list is empty
		if(head == null) {
			head = newNode;
		}
		else { //if list is not empty
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;		
			}
	}
	public void insertAtPos(int pos,int val) {
		Node newNode =new Node(val);
		if(pos==0) {
			insertAtBegining(val);
			return;
		}
		Node temp = head;
		for(int i =1; i<pos;i++) {// jump to previous node
			temp = temp.next;
			if(temp ==null) {
				throw new IndexOutOfBoundsException("Invalid Position"+pos);
				
			}
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	public void deleteAtpos(int pos) {
		if(head == null) {
			throw new IndexOutOfBoundsException("List is empty");
		}
		
		//IF WE WANT TO DELETE BEGINING POS USE ANOTHER METHODE OR USE BELOW LINES 
		if(pos ==0) {
			head =head.next;
			return;
		} //
		
		Node temp = head;
		Node prev = null;
		
		//Jump till node to be deleted
		for(int i=1;i<=pos;i++) {
			prev = temp; //KeepTrack of Prev Node
			temp = temp.next; //jump to next node
			
		}
		prev.next = temp.next;
		
	}
	
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = head.next;
		
		while(current != null) {
			next = current.next;
			current.next = prev; //reverse link
			
			//Jump
			prev = current;
			current = next;
		}
		head = prev;
	}
	 public void deleteAtEnd() {
	        if (head == null) { // If the list is empty
	            return;
	        }

	        if (head.next == null) { // If the list has only one node
	            head = null;
	            return;
	        }

	        Node current = head;
	        while (current.next.next != null) { // Traverse until the second-to-last node
	            current = current.next;
	        }
	        
	        current.next = null; // Remove the last node
	    }
	 
	public int getIndex(int pos) {
		if(head == null) {
			throw new IndexOutOfBoundsException("List is Empty");
		}
		
		Node temp =head;
		for(int i =0;i<pos;i++) {
			temp = temp.next;
			
			if(temp == null) {
				throw new IndexOutOfBoundsException("Invalid Position "+ pos);
			}
		}
		return temp.data;
	}
	public void update(int pos, int val) {
		Node newNode =new Node(val);
		if(head == null) {
			throw new IndexOutOfBoundsException("List is Empty");
		}
		
		Node temp =head;
		
		if(pos ==0) {
			
			newNode.next = head.next;
			head = newNode;
			return;
		}
		for(int i =1;i<pos;i++) { // prev position 
			temp =temp.next;
			if(temp == null || temp.next == null ) {
				insertAtPos(pos, val);
			}
		}
		newNode.next = temp.next.next;
		temp.next = newNode;
	}
	public boolean contain(int val) {
		Node temp = head;
		while(temp !=null) {
			if(temp.data == val) {
				return true;
			}
			temp =temp.next;
		}
		return false;
	}
}
