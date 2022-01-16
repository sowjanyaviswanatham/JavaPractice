package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicatesfromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(1);
		a.add(145);
		a.add(340);
		a.add(145);
		a.add(10);
		System.out.println("List after insertion:"+ a);
		Set<Integer> s = new LinkedHashSet(a);
		System.out.println("After duplicates removal:" + s);
		

	}

}
