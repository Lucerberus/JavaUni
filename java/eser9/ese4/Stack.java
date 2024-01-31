package eser9.ese4;
//qui vieni svolto esercizio 4 e 5
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack
{
	private ArrayList<String> list;
	private int maxSize;
	
	public Stack(int maxSize)
	{	
		this.maxSize=maxSize;
		list = new ArrayList<String>();
	}
	public ArrayList<String> getList()
	{
		return list;
	}
	
	public void push(String s)
	{	
		if(isFull())
			throw new IllegalStateException("Superato il limite dello stack");
		else
		{
			list.add(s);
			System.out.println("elemento aggiunto con successo ");
		}
	}
	public String pop()
	{
		if(isEmpty())
			throw new EmptyStackException();
		String rem = list.remove(list.size()-1);
		System.out.println("elemento rimosso con successo : "+rem);
		return rem;
			
	}
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public boolean isFull()
	{
		return list.size() == maxSize;
	}
	public String toString()
	{
		String c = "lista={ ";
		for(String i : list)
			c=c+i+" ";
		return c+"}";
	}
	public boolean equals(Stack f)
	{
		return (this.list).equals(f.list);
	}
}	
