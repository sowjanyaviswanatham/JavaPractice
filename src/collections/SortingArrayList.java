package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

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
		Collections.sort(a);
		System.out.println("list sorting in ascending order:"+a);
		Collections.sort(a,Collections.reverseOrder());
		System.out.println("list sorting in Descending order:"+a);

	}

}
