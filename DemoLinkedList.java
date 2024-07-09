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
public class Demo {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		//list.deleteAtpos(1); // This line throw the Exception 
		list.insertAtBegining(40);
		
		list.insertAtBegining(30);
		list.insertAtBegining(20);
		                       
		
		list.display();
		System.out.println("");
		list.insertAtPos(0,10);
		list.display();
		
		
		
		list.deleteAtpos(3);
		System.out.println("");
		list.display();
		
		System.out.println("");
		list.reverse();
		list.display();
		
		System.out.println("");
		list.deleteAtEnd();
		list.display();
		
		System.out.println();
		System.out.println(list.getIndex(1));
		
		System.out.println("");
		list.update(2,10);
		list.display();
		
		System.out.println( "\n"+list.contain(10));
		
		
	}
}
