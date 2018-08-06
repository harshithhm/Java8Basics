package com.harshi.jaava8.lamba.iterating.in;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.ValidationEvent;

public class MapSorting {
public static void main(String[] args) {
	Map<String, String>states=new HashMap<>();
	states.put("KA", "KARANATAKA");
	states.put("AP", "ANDRA PRASDESH");
	states.put("TN", "TAMIL NADU");
	states.put("TS", "TELANGANA");
	states.put("MH", "MAHARASTRA");
	states.put("DL", "NEW DELHI");
	states.put("CH", "CHANDIGARH");
	states.put("KL", "KERALA");
	states.forEach((k,v)->{
		System.out.println("Printing keys "+k);
		System.out.println("Printing values "+v);
		//method references
		
	});
}
}
