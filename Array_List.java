public class Array_List
{
	double num1 = 0.25;
	double num2 = 0.75;
	int head = 0;
	static int n;
	int remove;
	int store = 4;
	static int Array[];
	static double length;
	
	public Array_List()
	{
		Array = new int[store];
	}

	public void pop()
	{
		head--;
		remove = Array[head];
		int count = 0;
		Array[head] = 0;

		for(int i = 0; i < Array[i]; i++)
		{
			count++;
		}

		n = count;
		length = (double)n/store;
		System.out.println("The element removed is " +remove);
	}

	public void add(int e)
	{
		Array[head] = e;
		head++;
	}

	public void resize()
	{
		if(length == num1)
		{
			int newArray[] = new int[(store/2)*2];

			for(int i = 0; i < Array.length; i++)
			{
				newArray[i] = Array[i];
			}

			Array = newArray;
			store = store/2;

			for(int n : newArray)
			{
				System.out.print(n + "");
			}
		}
		else if(length == num2)
		{
			int newArray[] = new int[store*2];

			for(int i = 0; i < Array.length; i++)
			{
				newArray[i] = Array[i];
			}
			store = store * 2;
			Array = newArray;

			for(int j : newArray)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		else
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
	public int size()
	{
		return store;
	}
	public String toString()
	{
		String p = Integer.toString(store);
		return p;
	}

	public static void main(String []args)
	{
		Array_List obj = new Array_List();

		obj.add(6);
		obj.add(8);
		obj.add(5);
		obj.add(1);
		obj.pop();
		obj.resize();

		System.out.println("The new inserted number in the new array is " +n);
		System.out.println("The size of new array is " +obj.size());
		System.out.println("toString " +obj.toString());
	}

}