package linkedlist;

public class Stack {
int[] items;
int top;

public Stack(int size){
items=new int[size];
top =-1;
}
public void push(int i) throws Exception{
if(top==items.length-1){
throw new Exception("Stack is full!");
}
top++;
items[top]=i;
}
public static void main(String[] args) {
Stack stack = new Stack(3);
try {
stack.push(1);
stack.push(2);
stack.push(3);
System.out.println(stack);
stack.push(4);
System.out.println(stack);
} catch (Exception e) {
System.out.println(e.getMessage());
}
try{
System.out.println(stack.pop());
System.out.println(stack.pop());

System.out.println(stack.pop());
System.out.println(stack.pop());

System.out.println(stack);
} catch (Exception e) {
System.out.println(e.getMessage());
}

}



public int pop() throws Exception{
if(top==-1){
throw new Exception("Stack is empty!");
}
return items[top--];
}

public String toString(){
StringBuilder sb= new StringBuilder("Stack: ");
for(int i=0;i<=top;i++){
sb.append(items[i]+" ");
}
return sb.toString();
}
}