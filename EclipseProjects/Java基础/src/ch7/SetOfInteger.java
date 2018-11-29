package ch7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {

	public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
    	for (int i = 0; i < 10000; i++) {
    		intset.add(rand.nextInt(30) + (1<<16));
    	}
    	Iterator<Integer> it = intset.iterator();
    	while (it.hasNext()) {
    		System.out.print(it.next() - (1<<16) + " ");
    	}
	}	
}
