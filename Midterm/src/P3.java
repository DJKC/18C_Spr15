import java.util.Collections;
import java.util.*;

/*3)  Vector - Fill a vector with %m numbers.  Write a function
             statClass stat(vector x) that returns a class that
             contains the mode, min, max and average of the x vector 
             but uses a map to solve the mode problem and returns
             the important elements for the mode
             (nModes, freq, {Mode})
             
	     An associative array, i.e. a map is a data type composed of (key, value) pairs*/

public class P3{
	public static void main(String[] args){
		SuperVector vect = new SuperVector();
		SuperVector vect2 = new SuperVector(10);
		
		vect2.check();
		
		for(int i = 0; i < 10; i++){
			//System.out.println("\ni: " + i);
			vect2.set(i, 1);
		}
		
		vect2.check();
		
		vect2.print();
		
		System.out.println("\n********************");
		
		vect2.push_back(-1);
		
		vect2.print();
	}
}