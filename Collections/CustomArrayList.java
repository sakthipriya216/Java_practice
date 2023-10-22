/*
This file has internal implementation of ArrayList with genrics
  */

import java.util.Arrays;

public class CustomArrayList<T>
{
	private Object data[];
	private int size = 0;
	private static int defaultSize = 5;
	
	public CustomArrayList()
	{
		data = new Object[defaultSize];
	}
	
	public void add(T d)
	{
		if(this.full())
		{
			this.resize();
		}
		data[size++] = d;
	}
	
	private void resize()
	{
		Object temp[] = new Object[size*2];
		defaultSize*=2;
		
		for(int i=0; i<size; i++)
		{
			temp[i] = data[i];
		}
		
		data = temp;
	}

	public T get(int ind)
	{
		return (T)data[ind];
	}
	
	public void set(int ind, T d)
	{
		data[ind] = d;
	}
	
	public void remove()
	{
		data[size--] = null;
	}
	
	
	private boolean full() {
		
		return size == defaultSize;
	}
	
	public int size()
	{
		return size;
	}

	@Override
	public String toString()
	{
		String s = Arrays.toString(data);
		return "CustomArrayList{data = " + s + " size=" + size+"}";
		
	}
	public static void main(String[] args) 
	{
		CustomArrayList<Integer> l = new CustomArrayList<>();
		l.add(1);
		System.out.println(l);
		
		for(int i=1; i<=5;i++)
		{
			l.add(i*2);
		}
		
		System.out.println(l);
		System.out.println("Size= "+l.size);

	}
}
