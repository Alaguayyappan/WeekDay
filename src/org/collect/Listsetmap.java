package org.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Listsetmap {
	
	public static void main(String[] args) {
		Map <Integer,String> a =new HashMap <>();
		a.put(1,"100");
		a.put(2,"1000");
		a.put(3,"500");
		a.put(4,"400");
		a.put(2,"100");
		System.out.println(a);
		
	Set <Entry<Integer,String>> k = a.entrySet();
	System.out.println(k);
	
	for(Entry<Integer,String>x:k) {
		
		System.out.println(x);
		System.out.println(x.getKey());
		System.out.println(x.getValue());
	}
	 
	 
	 
		
			}

}
