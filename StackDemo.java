package collectionDemo;


import java.util.Stack;

public class StackDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(23);
		stack.push(33);
		stack.push(43);
		stack.push(53);
		stack.push(63);
		
		for(Integer i:stack)
		{
			System.out.println(i);
		}
		stack.pop();
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.search(43));
		System.out.println(stack.search(63));
		
		System.out.println(stack.empty());
		
		System.out.println(stack.hashCode());
	}
}