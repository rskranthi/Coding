package linkedlist;

public class LinkedList {
	Node head;
	
	public static class Node
	{
		int data;
		Node next;
		public Node(int i){data=i;next=null;}
	}

	public static void main(String args[])
	{
		LinkedList linkedlist1 = new LinkedList();
		LinkedList linkedlist2 = new LinkedList();
		LinkedList mergeCase = new LinkedList();
		linkedlist1.head=new Node(5);
		Node second = new Node(10);
		Node third= new Node(15);
		linkedlist1.head.next=second;
		second.next=third;

		linkedlist2.head=new Node(2);
		linkedlist2.insertNodeAtTail(3);
		linkedlist2.insertNodeAtTail(20);
		linkedlist1.printList();
		linkedlist2.printList();
		//LinkedList ll=linkedListMerge(linkedlist1,linkedlist2);
		
		
		//linkedlist1.head=linkedListMerge1(linkedlist1,linkedlist2);
		linkedlist2.head=linkedListMergeRecursion(linkedlist1.head,linkedlist2.head);
		linkedlist1.printList();
		System.out.println("Recursion thingy :-P");
		linkedlist2.printList();
		
		mergeCase.head=new Node(6);
		mergeCase.insertNodeAtTail(5);
		mergeCase.insertNodeAtTail(3);
		mergeCase.insertNodeAtTail(1);
		mergeCase.insertNodeAtTail(8);
	    mergeCase.insertNodeAtTail(7);
		mergeCase.insertNodeAtTail(2);
		mergeCase.insertNodeAtTail(4);
		LinkedList list = new LinkedList();
		
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
 
        // Creating a loop for testing 
        list.head.next.next.next.next.next = list.head.next.next;
     
        list.head=list.detectAndRemoveLoop(list.head);
        System.out.println("Linked List after removing loop : ");
        list.printList();
		
		//mergeCase.head=mergeCase.mergeSort(mergeCase.head);
		//System.out.println("After mergeSort");
		//System.out.println(mergeCase.head.data+""+mergeCase.head.next.data);
		//mergeCase.printList();
		//mergeCase.head=mergeCase.reverseInGroups(mergeCase.head,3);
		//System.out.println("After mergeSort in groups");
		//mergeCase.printList();
		LinkedList num1=new LinkedList();
		num1.head=new Node(7);
		num1.head.next=new Node(5);
		num1.head.next.next=new Node(9);
		num1.head.next.next.next=new Node(4);
		num1.head.next.next.next.next=new Node(6);
		
		LinkedList num2=new LinkedList();
		num2.head=new Node(8);
		num2.head.next=new Node(4);
		LinkedList sum=new LinkedList();
		sum.head=sum.add(num1.head,num2.head,sum);
		System.out.println("After Sum");
		sum.printList();
		
		LinkedList rotate = new LinkedList();
		rotate.head=new Node(10);
		rotate.insertNodeAtTail(20);
		rotate.insertNodeAtTail(30);
		rotate.insertNodeAtTail(40);
		rotate.insertNodeAtTail(50);
	    rotate.insertNodeAtTail(60);
		//rotate.insertNodeAtTail(70);
		
		rotate.listRotate(2);
		rotate.printList();
		
		
	
		
		
	}
	
	public Node listRotate(int k)
	{
		Node oldHead=head;
		Node current=head,temp=null;int count=1;
		
		while(current!=null && count!=k)
		{			
				current=current.next;
				count++;
		}
		
		temp=current.next;
		current.next=null;
		head=temp;
		current=temp;
		while(current.next!=null){
			current=current.next;
		}
		current.next=oldHead;
		
		
		
		return head;
	}
	
	
	public Node add(Node head1,Node head2,LinkedList sum)
	{
		Node num1=head1,num2=head2,temp=null,newHead=null;
		int value=0,carry=0;
		sum.head=null;
		
		
		while(num1!=null || num2!=null)
		{
			value+=carry;
			if(num1 !=null)value+=num1.data;
			if(num2!=null)value+=num2.data;
			System.out.println("value again "+value);
			
			carry=0;
			if(value>9){carry=1;value=value%10;}
			
			if(sum.head!=null){temp=new Node((int)value);
			
			newHead.next=temp;
			newHead=newHead.next;
				}
			
			else
			
			{
				System.out.println("value "+value);
				temp=new Node((int)value);newHead=temp;sum.head=newHead;
			
			System.out.println("sum.head"+sum.head.data);
			
			}
			 
			if (num1 != null) {
                num1 = num1.next;
            }
            if (num2 != null) {
                num2 = num2.next;
            }
			value=0;
		}
		
		System.out.println(sum.head.data);
		if(carry==1){temp=new Node(carry);newHead.next=temp;newHead=newHead.next;}
		return sum.head;
	}
	public Node detectAndRemoveLoop(Node node)
	{
		Node slow=node,fast=node,head=node;
		
		while(slow!=null&&fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		
		if(slow==fast)
		{
			head=removeLoop(slow,node);
			
			break;
		}
			
			
		}
		return node;
	}
	public Node removeLoop(Node loop,Node node)
	{
		Node slow=loop,fast=loop.next;
		int loopSize=1;
		while(slow!=fast){
			fast=fast.next;
			loopSize++;
		}
		Node end=slow;
		slow=node;
		fast=node;
		while(loopSize>0)
		{
			fast=fast.next;
			loopSize--;
		}
		while(slow!=fast)//finding start of loop
		{
			slow=slow.next;
			fast=fast.next;
		}
		System.out.println("start of loop"+slow.data);
		
		while(fast.next!=slow)
			fast=fast.next;
		
		
		fast.next=null;
		return node;
	}
	
	public Node reverseInGroups(Node head,int k)
	{
		Node prevX=null,currX=head,next=null,n=null,temp;
		int count=0;
		while(currX!=null && count<k)
		{
			next=currX.next;
			currX.next=prevX;
			prevX=currX;
			currX=next;
			count++;
					
		}
		if(next!=null)
			
			head.next=reverseInGroups(next,k);
		
		
		
	return prevX;
		
	}
		
		
	

	
public Node mergeSort(Node mergeHead){
		
		Node head=mergeHead,left=null,right=null;
		 if(head==null || head.next==null)return head;
		 
		 Node slow=head,fast=head.next;
		 
		 while(fast!=null)
		 {
			 fast=fast.next;
			 if(fast!=null)
			 {
				 slow=slow.next;
				 fast=fast.next;
			 }
		 }
		 
		 left=head;
		 right=slow.next;
		 slow.next=null;
		 System.out.println("left="+left.data+"right="+right.data);
		left=mergeSort(left);
		right=mergeSort(right);
		System.out.println("left="+left.data+"right="+right.data);
		 head=sortedMerge(left,right);
		 
		
		 
		
		return head;
		
	    }
public Node sortedMerge(Node mergeHead1,Node mergeHead2){
	Node ll1=null,head1=mergeHead1,head2=mergeHead2,ll2=null,newHead=null;
	
	if(head1==null)return head2;
	if(head2==null)return head1;
	ll1=head1;ll2=head2;
	
	
		if(ll1.data<=ll2.data)
		{
		newHead=ll1;
		newHead.next=sortedMerge(ll1.next,ll2);
			
		}
		else
		{
			newHead=ll2;
			newHead.next=sortedMerge(ll1,ll2.next);
		}

	
	
	if(head1.data<=head2.data)newHead=head1;
	else newHead=head2;
	
	
	return newHead;
	    }
		
/*working elegant recursion
 * 
 * public static Node linkedListMergeRecursion(Node list1, Node list2) {
	  if (list1 == null) return list2;
	  if (list2 == null) return list1;

	  if (list1.data < list2.data) {
	    list1.next = linkedListMergeRecursion(list1.next, list2);
	    return list1;
	  } else {
	    list2.next = linkedListMergeRecursion(list2.next, list1);
	    return list2;
	  }
	}
 */
	
public static Node linkedListMergeRecursion(Node head1,Node head2 ){
		
		
		
		if(head1==null && head2==null)return null;
		if(head1==null)return head2;
		if(head2==null)return head1;
		
		Node ans=null;
		
		if(head1.data<head2.data)
		{
			ans=head1;
			ans.next=linkedListMergeRecursion(ans.next,head2);
			return ans;
		}
		else
		{
			ans=head2;
			ans.next=linkedListMergeRecursion(ans.next,head1);
			return ans;
		}
		
		
		
		
		
		
	    }

	
public static Node linkedListMerge1(LinkedList l1,LinkedList l2){
		
		
		
		if(l1.head==null && l2.head==null)return null;
		if(l1.head==null)return l2.head;
		if(l2.head==null)return l1.head;
		
		Node head1=l1.head;
		Node head2=l2.head;
		Node head;
		
		if(head1.data<head2.data){head=head1;head1=head1.next;}
		else {head=head2;head2=head2.next;}
		
		Node p=head;
		while(head1!=null && head2!=null)
		{
			if(head1.data<head2.data)
			{
				
				p.next=head1;
				p=head1;
				head1=head1.next;
			}
			else 
			{
				p.next=head2;
				p=head2;
				head2=head2.next;
				
			}
		}
		
		if(head1==null)
			if(head2!=null)
				p.next=head2;
		
		if(head2==null)
			if(head1!=null)
				p.next=head1;
		
		
		
		
		
		return head;
	    
}	
		

	public void printList()
	{
		Node n=head;
		while(n!=null){System.out.println(n.data);n=n.next;}
		
	}
		public void insertNodeAtHead(int data)
		{
			Node insert=new Node(data);
			insert.next=head;
			head=insert;
			
		}
		
		public void insertNodeAtTail(int data)
		{
			Node insert=new Node(data);
			insert.next=null;
			if(head==null)head=insert;
			else{
			Node n=head;
			while(n.next!=null)n=n.next;
			n.next=insert;
			}
			
		}

		public void insertNodeinBetween(Node first,int data)
		{
			Node insert=new Node(data);
			insert.next=first.next;
			first.next=insert;
			
		}
		
		public void deleteNode(int key)
		{
			Node temp=head,prev=null,n;
			if(temp.data==key && temp !=null)
			{
				head=temp.next;
				return;
			}
			else
			{
				prev=head;
				n=head.next;
				while(n!=null)if(n.data==key){
					prev.next=n.next;
					return;
				}
				else
				{
					n=n.next;
					prev=prev.next;
				}
			}
			
			return;
		}
		
		public int getCount()
		{
			Node n=head;int count=0;
			while(n.next!=null){count++;n=n.next;}
			return count+1;
			
		}
		public int getCountRecursive(Node head)
		{
			
			Node n=head;
			if(n.next==null)return 1;
			return 1+getCountRecursive(n.next);
			
		}
		
		public void swapNodes(int x, int y)
	    {
			Node currX=head,currY=head,prevX=null,prevY=null;
			
			if(x==y)return;
			
			while(currX!=null&&currX.data!=x)
			{
				prevX=currX;
				currX=currX.next;
			}
			while(currY!=null&&currY.data!=y)
			{
				prevY=currY;
				currY=currY.next;
			}
			
			
			 if (currX == null || currY == null)
		            return;
			 
			if(currX!=head){
				prevX.next=currY;
				
			}
			else head=currY;
			
			if(currY!=head){
				prevY.next=currX;
				
			}
			else head=currX;
			
			//Swap Next pointers
			Node temp = currX.next;
			currX.next=currY.next;
			currY.next=temp;
	    }
		
		public void reverse()
		{
			Node prev=null,current=head,next=current.next,n=null;
			
			while(current!=null)
			{
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
				
			}
			head=prev;
		
			
		}
			
			
		}


