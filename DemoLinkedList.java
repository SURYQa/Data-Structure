package org.linkedlist;
import java.util.*;
public class Demo1 {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		//list.deleteAtpos(1); // This line throw the Exception 
		list.insertAtBegining(3);
		list.insertAtBegining(2);
		list.insertAtBegining(1);
		                       
		
		list.display();
		System.out.println("");
		list.insertAtPos(0,10);
		list.display();
		
		list.deleteAtpos(0);
		System.out.println("");
		list.display();
		System.out.println("");
		list.displayRev();
		
	}
	
}
package org.linkedlist;

import org.linkedlist.LinkedList.Node;

public class DoublyLinkedList {
	Node head;
	Node tail;
	
	class Node{
		int data;
		Node prev;
		Node next; // next value reference
		
		Node(int val){ //constructor
			data = val ;
			next = null;
			prev = null;
		}
	}
	DoublyLinkedList(){
		head = null;
		tail = null;
	}
	
	public void insertAtBegining(int val) {
		
		Node newNode = new Node(val);
		//when list is empty
		
		if(head == null) { 
			head = newNode;
			tail = newNode;
		}
		else { //else list is not empty
			head.prev = newNode;
			newNode.next = head; 
			
		}
		head = newNode;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;		
			}
	}
	public void displayRev() {
		Node temp = tail;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.prev;		
			}
	}
	
	
	public void insertAtPos(int pos, int val) {
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
		newNode.prev = temp;
		
		temp.next.prev = newNode;
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
			
			
			prev = current;
			current = next;
			
		}
		head = prev;
	}
}
