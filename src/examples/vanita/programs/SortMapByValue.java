package examples.vanita.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapByValue {
	public static void main(String[] argv) {

        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);

        System.out.println("Original...");
        System.out.println(unsortMap);
        
        Map<String, Integer> sortedMap = sortMapByValue(unsortMap);
        Map<String,Integer> genericSortedMap = sortMapByValueGeneric(unsortMap);
        System.out.println("Sorted...");
        System.out.println(sortedMap);
        
        System.out.println("Sorted by using generic method...");
        System.out.println(genericSortedMap);
        
        
        
	}
	
	/*public Map<String, Integer> sortMapByValueUsingStream(Map unsortedMap) {
		Map<String,Integer> sortedMap = (Map<String, Integer>) unsortedMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		
		 Object result = unsortedMap.entrySet().stream()
	                .sorted(Map.Entry.comparingByValue())
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		 return result;
	}*/
	
	public static Map<String,Integer> sortMapByValue(Map unsortedMap){
		//Map ---> List<Map> ---> Collections.sort() --> List<Map> (Sorted) ---> LinkedHashMap
		List <Map.Entry<String,Integer>> sortedList = new LinkedList<Map.Entry<String,Integer>>(unsortedMap.entrySet()); 
		Collections.sort(sortedList, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		Map<String,Integer> sortedMap = new LinkedHashMap<>();
		for(Map.Entry<String,Integer> e : sortedList) {
			sortedMap.put(e.getKey(), e.getValue());
		}
		return sortedMap;
	}
	
	public static <K, V extends Comparable<? super V>> Map<K,V> sortMapByValueGeneric(Map<K,V> unsortedMap){
		List <Map.Entry<K,V>> list = new ArrayList<>(unsortedMap.entrySet());
		Collections.sort(list, Entry.comparingByValue());
		Map<K, V> sortedMap = new LinkedHashMap<>(); 
		for(Entry<K,V> e : list) {
			sortedMap.put(e.getKey(), e.getValue());
		}
		return sortedMap;
	}
}
