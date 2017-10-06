package stack;

import java.util.Scanner;

public class StackUsing {

	private Node top=null;
	private int length=0;
	
	/**we use stack to show push pop and peek
	 * pop will go back from the current element to previous element
	 * push will first move  the top element and then replace new element to the most 
	 *  You can pop/push (enqueue/dequeue) and peek from either side but cannot access 
	 * Method : PUSH(int data)
	 * @param args
	 */
	
	public void push(int item){
		Node node=new Node(item);//we are taking an array of node to implement push
		if(top== null){//to get the length of the size of an array to push the elements
			top=node;
		}else{
			node.next=top;
			top=node;
		}
		length++;
	}

	public int pop(){//to implement pop
		int result = -1;
		if(top!=null){//here to decreasing the length of array size to pop the elements
			result=top.data;
			top=top.next;
			length--;
		}
		return result;
	}
	
	public int peek(){//to implement peek 
		
		if(top==null){
			return -1;//it shows element of which we want from by asking the size of an element
		}else{
			return top.data;
		}
	}
	
	/** Print all the elements of this Stack using toString() method**/
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();///
		Node temp=null;
		result.append("[");
		if(top!=null){
			for(temp=top;temp !=null;temp=temp.next){
				result.append(temp.data+" ");
			}
		}
		result.append("]");
		return result.toString();
	}
	
	public int size(){
		return length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 stack.StackUsing stack = new StackUsing();
		System.out.println("Current Length Is ::"+stack.size());
		stack.push(9);
		stack.push(2);
		stack.push(7);
		stack.push(11);
		System.out.println(stack);// this will call the toString() method
		System.out.println("Peek :: "+stack.peek());
		System.out.println("POP ::"+stack.pop());
		System.out.println("Current Length Is ::"+stack.size());
		System.out.println(stack);
	}
	
	

	private class Node{
		private Node next=null;
		private int data = 2;
		
		private Node(int value){
			this.data=value;
		}
	}
}