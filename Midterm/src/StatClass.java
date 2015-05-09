import java.util.Vector;


/*3)  Vector - Fill a vector with %m numbers.  Write a function
             statClass stat(vector x) that returns a class that
             contains the mode, min, max and average of the x vector 
             but uses a map to solve the mode problem and returns
             the important elements for the mode
             (nModes, freq, {Mode})
             
	     An associative array, i.e. a map is a data type composed of (key, value) pairs*/

public class StatClass{
	private int min;
	private int max;
	private float average;
	private Vector<Integer> modes;
	
	public static Vector<Integer> mode(Vector<Integer> x){
		Vector<Integer> modes_vect = new Vector<Integer>(x.size());
		
		for(int i  = 0; i < x.size(); i++)
			for(int j  = 0; j < x.size(); j++)
				if((x.elementAt(i) == x.elementAt(j)) && (i != j))
					if(!contains(modes_vect, x.elementAt(j)))
							modes_vect.add((Integer)x.elementAt(j));
		
		return modes_vect;
	}
	
	private static boolean contains(Vector<Integer> x, int value){
		for(int i = 0; i < x.size(); i++)
			if(x.elementAt(i) == (Integer) value)
				return true;
		
		return false;
	}
}
