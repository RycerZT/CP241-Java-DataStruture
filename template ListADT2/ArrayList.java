class  ArrayList implements ListADT
{
	private int total;
	private Object list[];
	int current,size;

	public ArrayList()
	{
		List();
	}

	public void List()
	{
		current= -1;
		total = 100;
		size=0;
		list = new Object[total];

	}

	public void insert(Object e) throws Exception 
	{
		if (full())
		{			
			throw new Exception("List is full");
		}else
			{
				size++;
				if (size==1)
				{
				current++;
				list[current]=e;
				}
				else
				{
				for(int i=size-1;i>current+1;i--)
					list[i]=list[i-1];
				current++;
				list[current] = e;
				}
				
			}
	}

	public Object retrieve() throws Exception 
	{
		if (empty())
	 	{
				throw new Exception("List is empty");
		}
		else
		{
			return list[current];
		}
	}

	public void delete() throws Exception 
	{
		if (empty())
		{			
			throw new Exception("List is empty");
		}else
			{
				if (size == 1)
					current = -1;
				else if (current==size-1)
					current = 0;
				else
					{
					for(int i=current;i<size-1;i++)
					list[i]=list[i+1];		
					current = 0;
					}
				size--;
			}
	}

	public boolean empty() 
	{
		if(size==0)
			return true;
		else
			return false;
	}

	public boolean full()
	{
		if (size == total)
			return true;
		else
			return false;
	}
	public void update(Object e) throws Exception
	{
		if (empty())
		{			
			throw new Exception("List is empty");
		}else
			{
				list[current] = e;
			}
	}

	public void findFirst() throws Exception
	{
		if (empty())
		{			
			throw new Exception("List is empty");
		}else
			{
				current=0;
			}
	}

	public void findNext() throws Exception
	{
		if (empty())
		{			
			throw new Exception("List is empty");
		}else
			{
				if (current != size-1)
					current = current+1;
			}
	}

	public boolean findkey(Object tKey)
	{
		printAll();
		
		//return SeqSearch(tKey);
		//return SeqSearchWithSentinel(tKey);

		//bubbleSort();
		//selectionSort();
		//insertionSort();
		//quickSort(0,size-1);

		return binSearch(tKey,0,size-1);
		//return binSearch(tKey);
	}

	public boolean SeqSearch( Object key )
	{
		int position;
		boolean found = false;
		int i = 0;
		while (!found && i<total){

		}
		return true;
	}

	public boolean SeqSearchWithSentinel( Object key )
	{
		return true;
	}
	
	public boolean binSearch( Object key) 
	{
		int low = 0;
        	int high = size - 1;
        	int mid=-1;
		current = -1;
		
		return true;
	}

	public boolean binSearch( Object key, int low, int high) 
	{
		int mid = (low + high)/2;
		
		return true;
	}

	public void bubbleSort()
	{
		Object tmp;
		//insert codes here

	}

	public void selectionSort()
	{
		int min_id;
		Object tmp,min;
		//insert codes here

	}

	public void insertionSort()
	{
		   Object tmp;
		   int i;
		   //insert codes here
	
	}

	public void quickSort(int left,int right)
	{
		Object tmp,mid;
		int i,j;
		//insert codes here

	}

	public int getSize()
	{
		return size;
	}

	public void printAll(){
		for (int i=0;i<size ;i++ )
		{
			System.out.print(list[i]+ " ");
		}
		System.out.println();
	}
}