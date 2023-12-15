package eser9.ese4;

import java.util.ArrayList;
		

public class Stack
{
	private ArrayList<String> list;
	
	public Stack()
	{
		list = new ArrayList<String>(10);
	}
	
	public void push(String s)
	{	
		if(list.size() >= 10)
			System.out.println("hai superato il limite dello stack");
		else
			list.add(0, s);
	}
	public String pop()
	{
		int com = list.size();
		return list.get(com);
	}
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	public boolean IsFull()
	{
		return list.size() == 10;
	}
	public String toString()
	{
		String c = "lista={ ";
		for(String i : list)
			c=c+i+" ";
		return c+"}";
	}
	public boolean equals(Stack list2)
	{
		return list.equals(list2);
	}
}	
