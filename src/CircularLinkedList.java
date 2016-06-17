//package linkedlist;

public class CircularLinkedList {
	Node head,temp;
	public static class Node
	{
		int data;
		Node next;
		
		public Node(int i)
		{
			this.data=i;
			this.next=null;
		}
	}
	
	public void pushAtHead(int data){
		
		Node add = new Node(data);
		if(head==null){head=add;temp=add;}
		else
		{
			add.next=head;
			
			head=add;
		}
		temp.next=head;
	}
	
	public void print(Node node)
	{
		Node current=node,temp=null,first=node;
		System.out.println(node.data);
		while(current.next!=node){
			current=current.next;
			System.out.println(current.data);
		}
	}
	
	public Node twoHalves()
	{
		Node head2=null;
		Node slow=head,fast=head;
		
		while(fast.next!=head)
		{
			fast=fast.next;
			if(fast.next!=head)
			{
				slow=slow.next;
				fast=fast.next;
			}
			
			
			
		}
		
		head2=slow.next;
		slow.next=head;
		fast.next=head2;
		return head2;
	}
	
	public void sortedInsert(int data)
	{
		Node insert=new Node(data);Node current=null;
		
		if(head==null){head=insert;head.next=head;}
		
		if(data<head.data)
		{
			current=head;
			while(current.next!=head)current=current.next;
			
			current.next=insert;
			insert.next=head;
			head=insert;
		}
		else
		{
			current=head;
			while(current.next!=head && current.next.data<=data)current=current.next;
			insert.next=current.next;
			current.next=insert;
		}
		
	}
	public static void main(String args[])
	{
		
		CircularLinkedList cll = new CircularLinkedList();
		
		cll.pushAtHead(12);
		cll.pushAtHead(56);
		cll.pushAtHead(2);
		cll.pushAtHead(11);
		cll.pushAtHead(23);
		
		cll.print(cll.head);
		
		Node head2=cll.twoHalves();
		System.out.println("list1");
		cll.print(cll.head);
		System.out.println("list2");
		cll.print(head2);
		Node temp=null;
		int arr[] = new int[] {12, 56, 2, 11, 1, 90};
		CircularLinkedList list=new CircularLinkedList();
		for (int i = 0; i < 6; i++)
        {
            temp = new Node(arr[i]);
            list.sortedInsert(temp.data);
        }
	
		list.print(list.head);
		
		
	}

}
