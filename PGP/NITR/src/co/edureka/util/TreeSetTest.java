package co.edureka.util;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		System.out.println(names.add("Sunil")); //true
		names.add("Pankaj");
		names.add("Sanjay");
		names.add("sunil");
		names.add("Praveen");
		names.add("Anil");
		System.out.println(names.add("Sunil")); //false
		
		System.out.println(names);
				
		//System.out.println("Sanjay".compareTo("Sunil"));
		
		names.add(null); //java.lang.NullPointerException
		System.out.println(names);
	}

}
