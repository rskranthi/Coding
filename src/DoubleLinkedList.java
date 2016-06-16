package linkedlist;

import javax.sound.sampled.ReverbType;

public class DoubleLinkedList {
	Node head;
	
	class Node
	{
		int data;
		Node prev,next;
		
		public Node(int data)
		{
			this.data=data;
			this.prev=null;
			this.next=null;
			
		}
	}
	
	public void push(int data)
	{
		Node newNode = new Node(data);
		if(head==null)head=newNode;
		else
		{
			newNode.next=head;
			newNode.prev=null;
			head.prev=newNode;
			head=newNode;
		}
		
	}
	
	public void printList()
	{
		Node current=head;Node prev=null;
		System.out.println("Traversal in forward direction");
		while(current!=null)
		{
			System.out.println(current.data);
			prev=current;
			current=current.next;
			
			
		}
		
		System.out.println("Traversal in reverse direction");
		current=prev;
		while(current!=head)
		{
			System.out.println(current.data);
			current=current.prev;
		}
		System.out.println(current.data);
	}
	
	public void append(int data)
	{
		Node current=head;
		Node newNode = new Node(data);
		while(current.next!=null)
		{
			
			current=current.next;
			
		}
		
		current.next=newNode;
		newNode.prev=current;
		
	}
	
	public void insertAfter(Node prevNode,int data)
	{
		Node current=head;Node temp=null;
		Node newNode = new Node(data);
		if(prevNode==null){
			System.out.println("prevNode cant be null");
			return;
		}
		
		while(current!=prevNode)
		{
			current=current.next;
		}
		
		newNode.next=prevNode.next;
		prevNode.next=newNode;
		newNode.prev=prevNode;
		if (newNode.next != null)
		      newNode.next.prev = newNode;
		
		
	}
	
	public void deleteNode(Node deleteNode)
	{
		Node current=head;
		
		if(deleteNode.data == head.data)
		{
			head=head.next;
			head.prev=null;
		}
		
		else
		{
			while(current.next!=null && current.next!=deleteNode)
			{
				
				current=current.next;
			}
			
			if(current.next==null)
			{
				System.out.println("Node not found");
				return;
			}
			else
			{
				if(deleteNode.next==null){current.next=null;deleteNode.prev=null;}
				
				else
				{
					current.next=deleteNode.next;
					deleteNode.next.prev=current;
				}
				
				
			}
		}
		
	}
	
	public void reverse()
	{
		Node current=head,temp=null;
		while(current!=null){
		temp=current.prev;
		
		current.prev=current.next;
		current.next=temp;
		current=current.prev;
		}
			 
	         /* Before changing head, check for the cases like empty 
	        list and list with only one node */
	     if(temp != null )
	        head= temp.prev;
		
	}
	
	
	public static void main(String args[])
	{
		
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		
		doubleLinkedList.push(2);
		doubleLinkedList.push(4);
		doubleLinkedList.push(8);
		doubleLinkedList.push(10);
		
		
		doubleLinkedList.printList();
		
		//doubleLinkedList.deleteNode(doubleLinkedList.head);  /*delete first node*/
		//doubleLinkedList.deleteNode(doubleLinkedList.head.next);  /*delete middle node*/
		//doubleLinkedList.deleteNode(doubleLinkedList.head.next); 
		doubleLinkedList.reverse();
		doubleLinkedList.printList();
	}

}
