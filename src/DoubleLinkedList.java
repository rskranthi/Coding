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
	
	void swap ( int a, int b )
	{   int t = a;      a = b;       b = t;   }
	 
	
	public Node partition(Node wall,Node partition)
	{
		int x=partition.data;
		
		Node p=wall.prev;
		
		for(Node j=wall;j!=partition;j=j.next)
		{
			if(j.data<=x)
			{
				// Similar to i++ for array
	            p = (p == null)? wall : p.next;
	 
	            swap(p.data, j.data);
			}
		}
		
		p = (p == null)? wall : p.next; // Similar to i++
	    swap(p.data, partition.data);
	    return p;
	}
	public void _quicksort(Node wall,Node pivot)
	{
		
		if(wall!=pivot && wall!=pivot.next && wall!=null)
		{
			Node p=partition(wall,pivot);
			System.out.println(wall.data+""+p.data+""+pivot.data);
			_quicksort(wall,p.prev);
			_quicksort(p.next,pivot);
			
			
		}
	}
	public void quicksort()
	{
		Node current=head,last=null;
		while(current!=null)
		{
			System.out.println(current.data);
			last=current;
			current=current.next;
					
		}
		
		_quicksort(head,last);
		
	}
	
	public static void main(String args[])
	{
		
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		
		doubleLinkedList.push(5);
		doubleLinkedList.push(20);
		doubleLinkedList.push(4);
		doubleLinkedList.push(3);
		doubleLinkedList.push(30);
		
		
		doubleLinkedList.printList();
		
		//doubleLinkedList.deleteNode(doubleLinkedList.head);  /*delete first node*/
		//doubleLinkedList.deleteNode(doubleLinkedList.head.next);  /*delete middle node*/
		//doubleLinkedList.deleteNode(doubleLinkedList.head.next); 
		doubleLinkedList.reverse();
		doubleLinkedList.printList();
		
		doubleLinkedList.quicksort();
		doubleLinkedList.printList();
	}

}
