package codefights;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CampusCup {

	public static void main(String[] args) {
		String[] emails = {"b@rain.ifmo.ru", 
		                   "c@rain.ifmo.ru", 
		                   "d@rain.ifmo.ru", 
		                   "e@rain.ifmo.ru", 
		                   "f@rain.ifmo.ru", 
		                   "g@rain.ifmo.ru", 
		                   "h@rain.ifmo.ru", 
		                   "i@rain.ifmo.ru", 
		                   "j@rain.ifmo.ru", 
		                   "k@rain.ifmo.ru", 
		                   "l@rain.ifmo.ru", 
		                   "m@rain.ifmo.ru", 
		                   "n@rain.ifmo.ru", 
		                   "o@rain.ifmo.ru", 
		                   "p@rain.ifmo.ru", 
		                   "q@rain.ifmo.ru", 
		                   "r@rain.ifmo.ru", 
		                   "s@rain.ifmo.ru", 
		                   "t@rain.ifmo.ru", 
		                   "u@rain.ifmo.ru", 
		                   "v@rain.ifmo.ru", 
		                   "w@rain.ifmo.ru", 
		                   "x@rain.ifmo.ru", 
		                   "y@rain.ifmo.ru", 
		                   "a@mit.edu.ru", 
		                   "b@mit.edu.ru", 
		                   "c@mit.edu.ru", 
		                   "d@mit.edu.ru", 
		                   "e@mit.edu.ru", 
		                   "f@mit.edu.ru", 
		                   "g@mit.edu.ru", 
		                   "h@mit.edu.ru", 
		                   "i@mit.edu.ru", 
		                   "j@mit.edu.ru", 
		                   "k@mit.edu.ru", 
		                   "l@mit.edu.ru", 
		                   "m@mit.edu.ru", 
		                   "n@mit.edu.ru", 
		                   "o@mit.edu.ru"};
        String[] ret = sortSeparately(emails);

		for (int i=0; i< ret.length; i++) {
			System.out.println(ret[i]);
		}
	}
	public static String[] sortSeparately(String[] emails){
        HashMap<String, Integer> schools = new HashMap<String, Integer>();
        int[] scores = new int[emails.length];
	    ArrayList<String> tempList = new ArrayList<>();

	    for (String str : emails) {
	        tempList.add(str.substring(str.indexOf("@")+1));
	    }
	    for (String e : tempList) {
	        if (! schools.containsKey(e) ){
	            schools.put( e, 20);
	        }
	        else {
	            schools.put (e, schools.get(e)+20);
	        }
	    }

	    ArrayList<String> five = new ArrayList<>();
	    ArrayList<String> four = new ArrayList<>();
	    ArrayList<String> three = new ArrayList<>();
	    ArrayList<String> two = new ArrayList<>();
	    ArrayList<String> one = new ArrayList<>();
	    ArrayList<String> none = new ArrayList<>();

	    
	    for (String e : schools.keySet()) {
	    	if (schools.get(e) >= 500){
	    		five.add(e);
	    	}
	    	else if (schools.get(e) >= 400){
	    		four.add(e);
	    	}
	    	else if (schools.get(e) >= 300){
	    		three.add(e);
	    	}
	    	else if (schools.get(e) >= 200){
	    		two.add(e);
	    	}
	    	else if (schools.get(e) >= 100){
	    		one.add(e);
	    	}
	    	else {
	    		none.add(e);
	    	}
	    }
	    Collections.sort(five);
	    Collections.sort(four);
	    Collections.sort(three);
	    Collections.sort(two);
	    Collections.sort(one);
	    ArrayList<String> finalArr = new ArrayList<>();
	    finalArr.addAll(five);
	    finalArr.addAll(four);
	    finalArr.addAll(three);
	    finalArr.addAll(two);
	    finalArr.addAll(one);
	    finalArr.addAll(none);
	    String[] stockArr = new String[finalArr.size()];
	    stockArr = finalArr.toArray(stockArr);
	    return stockArr;
	}
}
