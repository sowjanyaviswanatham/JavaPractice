package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReversingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(1);
		a.add(324);
		a.add(340);
		a.add(145);
		a.add(1455);
		
		System.out.println(a); 
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		//Reversing the arrylist
		
		ListIterator<Integer> itr = a.listIterator(a.size());
		while(itr.hasPrevious())
		{
			int num = itr.previous();
			//System.out.println(num);
			b.add(num);
		}
		System.out.println(b);
		
		
	}

}
