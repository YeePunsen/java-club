package apache.commons.collection;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

public class Collection_03_Association {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		String[] arrayA = new String[]{"1","2","3","4","5"};
		String[] arrayB = new String[]{"3","4","4","5","6","7"};
	
		List a = Arrays.asList(arrayA);
		List b = Arrays.asList(arrayB);

		List union = (List) CollectionUtils.union(a, b); //并集
		List intersection = (List) CollectionUtils.intersection(a, b); //交集
		List disjunction = (List) CollectionUtils.disjunction(a, b); //分离 - 各自独有的部分
		List subtract = (List) CollectionUtils.subtract(a, b); //位于其中一方的元素，并且不含交集
		
		Collections.sort(union);
		Collections.sort(intersection);
		Collections.sort(disjunction);
		Collections.sort(subtract);
		
		
		System.out.println("A : "+ArrayUtils.toString(a.toArray()));
		System.out.println("B : "+ArrayUtils.toString(b.toArray()));
		
		System.out.println("union : "+union);
		System.out.println("intersection : "+intersection);
		System.out.println("disjunction : "+disjunction);
		System.out.println("subtract : "+subtract);
		
		
	}

}
