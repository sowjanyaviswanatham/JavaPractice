package collections;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("straberry");
		fruits.add("grape");
		System.out.println(fruits);
		String[] item = fruits.toArray(new String[fruits.size()]);
		for(String s:item)
		{
			System.out.println(s);
		}
		
		
	}

}
