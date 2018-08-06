package com.harshi.jaava8.lamba.sorting.in;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MatchSorter {
private int batsMenOrder;
private String batsMenName;
private String batsMenLastName;
/**
 * @param batsMenOrder
 * @param batsMenName
 * @param batsMenLastName
 */
public MatchSorter(int batsMenOrder, String batsMenName, String batsMenLastName) {
	super();
	this.batsMenOrder = batsMenOrder;
	this.batsMenName = batsMenName;
	this.batsMenLastName = batsMenLastName;
}
public static void main(String[] args) {
List<MatchSorter>list=	getMatchSorterList();
list.sort(new Comparator<MatchSorter>(){

	@Override
	public int compare(MatchSorter o1, MatchSorter o2) {
		// TODO Auto-generated method stub
		return o1.batsMenOrder-o2.batsMenOrder;
	}
	
});
for (MatchSorter matchSorter : list) {
	System.out.println(matchSorter.batsMenOrder);
}
}
public static List<MatchSorter> getMatchSorterList() {
	List<MatchSorter>matchSorters=new ArrayList<>();
	matchSorters.add(new MatchSorter(9, "Sachin", "Tendulkar"));
	matchSorters.add(new MatchSorter(3, "Sehwag", "Virendar"));
	matchSorters.add(new MatchSorter(4, "Kohli", "Virat"));
	matchSorters.add(new MatchSorter(7, "Dhoni", "Mahendra"));
	
	return matchSorters;
	
}
}
