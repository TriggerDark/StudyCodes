package ch7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFeatures {
    public static void main(String[] args) {
    	Random rand = new Random(47);
    	List<Integer> ints = new ArrayList<Integer>();
    	for (int i = 0; i < 10; i++) {
    		ints.add(i);
    	}
    	System.out.println("1: " + ints);
    	
    	Integer n1 = new Integer(10);
    	ints.add(n1);
    	System.out.println("2: " + ints);
    	System.out.println("3: " + ints.contains(n1));
    	
    	ints.remove(n1);
    	Integer n2 = ints.get(2);
    	System.out.println("4: " + ints.indexOf(n2));
    	
    	List<Integer> sub = ints.subList(1, 4);
    	System.out.println("subList: " + sub);
    	System.out.println("5: " + ints.containsAll(sub));
    	
    	Collections.shuffle(sub, rand);
    	System.out.println("shuffled subList: " + sub);
    	
    	Collections.sort(sub);
    	System.out.println("sorted subList: " + sub);
    	
    	List<Integer> copy = new ArrayList<Integer>(ints);
    	System.out.println("copy: " + copy);
    	sub = Arrays.asList(ints.get(2), ints.get(7));
    	System.out.println("sub: " + sub);
    	copy.retainAll(sub);
    	System.out.println("6: " + copy);
    	
    	copy = new ArrayList<Integer>(ints);
    	System.out.println("copy: " + copy);
    	copy.removeAll(sub);
    	System.out.println("7: " + copy);
    	
    	copy.set(1, new Integer(11));
    	System.out.println("8: " + copy);
    	copy.addAll(sub);
    	System.out.println("9: " + copy);
    	
    	System.out.println("10: " + ints.isEmpty());
    	ints.clear();
    	System.out.println("11: " + ints.isEmpty());
    }
}


