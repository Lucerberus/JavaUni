package eser10.ese2;

import java.util.ArrayList;
import java.util.EmptyStackException;
//qui la testa della pila è la testa della lista
public class Stack<E>
{
	private ArrayList<E> list;
	private int maxSize;
	
	public Stack(int maxSize)
	{	
		this.maxSize=maxSize;
		list = new ArrayList<E>();
	}
	
	public void push(E s)
	{	
		if(isFull())
			throw new IllegalStateException("Superato il limite dello stack");
		else
		{
			list.add(0, s);
			System.out.println("elemento aggiunto con successo ");
		}
	}
	public E pop()
	{
		if(isEmpty())
			throw new EmptyStackException();
		E rem = list.remove(0);
		System.out.println("elemento rimosso con successo : "+rem);
		return rem;
			
	}
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	public boolean isFull()
	{	
		if(maxSize == 0)
			return false;
		else
			return list.size() == maxSize;
	}
	public String toString()
	{
		String c = "lista={ ";
		for(E i : list)
			c=c+i.toString()+" ";
		return c+"}";
	}
}	
