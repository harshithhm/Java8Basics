package com.harshi.jaava8.lamba.methodreference.in;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencer {
	public static void main(String[] args) {
		
	
		List<String>qoutes=new ArrayList<>();
		qoutes.add("Small Steps Daily");
		qoutes.add("Small Steps Dail");
		qoutes.add("Never Say you cant");
		qoutes.add("Patience");
		qoutes.add("Will");
		qoutes.add("Badly");
	//	qoutes.forEach(System.out::println);
		//qoutes.forEach(qoute->System.out.println(qoute));
		qoutes.stream().filter(qoute->qoute.contains("Small Steps Dail")).forEach(System.out::println);;
	}	
}
