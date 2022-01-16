package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		//String[] fruits = new String[3];
		String[] fruits = {"mango","apple","orange","grape"};
		List<String> fruitList = new ArrayList();
		fruitList =  Arrays.asList(fruits);
		System.out.println(fruitList);
		
	}

}
