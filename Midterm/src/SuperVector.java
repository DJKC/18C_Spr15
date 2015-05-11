
public class SuperVector{
	int size;
	Integer[] data;
	int capacity;
	
	SuperVector(){
		size = 0;
		data = new Integer[size];
	}
	
	SuperVector(int size){
		if(size < 1)
			size = 1;
			
		this.size = size;
		
		data = null;
		data = new Integer[size];
	}
	
	public int size(){
		return size;
	}
	
	public void push_back(int number){
		int oldSize = size;
		
		resize();

		data[oldSize] = number;
	}
	
	public void pop_back(){
		//Integer[] new_data = new Integer[size - 1];
		data[size - 1] = null;
		size--;
	}
	
	public boolean delete(int index){		
		if(index >= size)
			return false;
		
		for(int i = index; i < size - 1; i++)
			data[i] = data[i + 1];
		
		pop_back();
		
		return true;
	}
	
	public void print(){
		
		//System.out.println("\nE");
		
		for(int i = 0; i < data.length; i++){
			if(i != 0 && i % 5 == 0)
				System.out.println();
				
			System.out.print("data[" + i + "] = " + data[i] + ".");
		}
	}
	
	public void set(int index, Integer value){		
		if(index < size){
			data[index] = value;
			size++;
		}
		
		else
			System.out.println("\nNot enough room");
	}
	
	public Integer get(int index){
		return (index <= size) ? data[index] : null;
	}
	
	public void resize(){
		if(arrayFull()){
			Integer[] new_data = new Integer[size * 2];
			
			check();
			
			for(int i = 0; i < size; i++){
				try{new_data[i] = data[i];}
				catch(Exception e){System.out.println("I: " + i);}
			}
			
			data = null;
			data = new_data;
			
			size *= 2;
		}
	}
	
	public void check(){
		System.out.println("Capacity: " + capacity() + "\nSize: " + size);
	}

	private boolean arrayFull(){		
		if(data[data.length - 1] == null)
			System.out.println("not full");
		
		else
			System.out.println("full");
		
		System.out.println("\nlast element: " + get(data.length - 1));
		
		return (data[data.length - 1] == null ? false : true);
	}
	
	public int capacity(){	
		int capacity = 0;
		
		for(int i = 0; i < data.length; i++)
			if(data[i] != null)
				capacity++;
		
		return capacity;
	}
}