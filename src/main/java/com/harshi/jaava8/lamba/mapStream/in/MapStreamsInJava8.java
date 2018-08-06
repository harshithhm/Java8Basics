package com.harshi.jaava8.lamba.mapStream.in;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapStreamsInJava8 {
	public static void main(String[] args) {
		List<String>listOfSuperHeros=Arrays.asList("Batman","AntMan","IronMan","SuperMan");
	List<String>strings=	listOfSuperHeros.stream().map(String::toUpperCase).collect(Collectors.toList());
	//System.out.println(strings);
	listOfSuperHeros.stream().map(String::toLowerCase).collect(Collectors.toList());
List<String>stringOfHeroesAppended=	listOfSuperHeros.stream().map(string->string.concat("I am Hero")).collect(Collectors.toList());
	System.out.println(stringOfHeroesAppended);
	}

}
