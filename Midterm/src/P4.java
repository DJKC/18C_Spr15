import java.util.Collections;
import java.util.*;

/*2)  Vector - Fill a vector with %m numbers.  Write a function
             vector mode(vector x) that returns a vector that
             represents the mode of vector x.  Note:  Test for
             no mode, 1 mode, and multiple modes.*/

public class P4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random randy = new Random();
		Vector<Integer> vect, mode_vect;
		int elements;
		
		do{
			System.out.print("Return 100 modulo by how many elements: ");
			elements = input.nextInt();
		}while(elements > 100 || elements < 0);
		
		 vect = new Vector<Integer>(100 % elements);
		
		for(int i = 0; i < vect.capacity(); i++)			
			vect.add(i, (Integer) randy.nextInt(100) + 1);
		
		mode_vect = mode(vect);
		
		System.out.printf("\nThe modes of the vector: ");
		
		for(Integer i : mode_vect)
			System.out.print(i + " ");
	
		input.close();
	}
	
	public static Vector<Integer> mode(Vector<Integer> x){
		Vector<Integer> mode_vect = new Vector<Integer>();
			
		for(int i = 0; i < x.capacity(); i++)
			for(int j = 0; j < x.size(); j++)
				if(x.get(i) ==  x.get(j) && i != j)
					if(!mode_vect.contains(x.get(j)))
						mode_vect.add(x.get(j));
		
		return mode_vect;
	}
}