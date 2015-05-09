
public class SuperVector{
	Integer size;
	Integer[] data;
	
	SuperVector(){
		size = 0;
		data = new Integer[size];
	}
	
	SuperVector(int size){
		this.size = 0;
		data = new Integer[size];
	}
	
	public int size(){
		return size;
	}
	
	public void push_back(int number){
		resize();
		
		data[size] = number;
		size++;
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
		
		size--;
		data[size] = null;
		
		return true;
	}
	
	public void print(){
		for(Integer i : data)
			System.out.print(i + " ");
	}
	
	public void set(int index, Integer value){
		if(index < size)
			data[index] = value;
	}
	
	public Integer get(int index){
		
		return (index <= size) ? data[index] : null;
	}
	
	public void resize(){
		Integer[] new_data = new Integer[size * 2];
		
		for(int i = 0; i < size; i++)
			new_data[i] = data[i];
		
		data = null;
		data = new_data;
		
		size *= 2;
	}
}