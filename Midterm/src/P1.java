import java.util.*;

public class P1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random randy = new Random();
		Vector<Integer> vect = new Vector<Integer>(100), new_vect;
		int elements;
		
		do{
			System.out.print("How many elements do you want to return : ");
			elements = input.nextInt();
		}while(elements > 100 || elements < 0);
		
		for(int i = 0; i < vect.capacity(); i++)			
			vect.add(i, (Integer) randy.nextInt(100) + 1);
		
		Collections.sort(vect);
		
		new_vect = top(vect, elements);
		
		System.out.printf("\nYour %d elements: ", elements);
		
		for(Integer i : new_vect)
			System.out.print(i + " ");
	
		input.close();
	}
	
	public static Vector<Integer> top(Vector<Integer> x, int p){
		Vector<Integer> new_vect = (Vector<Integer>) x.clone();
		new_vect.setSize(p);
			
		return new_vect;
	}
}