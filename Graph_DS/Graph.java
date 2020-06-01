import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

class Graph <T>{
	
	private HashMap<T, LinkedList<T>> map;
	
	Graph() {
		map = new HashMap<>();
	}
	
	public void add(T src, T dest, boolean direction) {
		
		if(!map.containsKey(src)) {
			map.put(src, new LinkedList<T>());
		}
		
		if(!map.containsKey(dest)) {
			map.put(dest, new LinkedList<T>());
		}
		
		map.get(src).add(dest);
		if(direction == true) {
			map.get(dest).add(src);
		}
			
	}
	
	public void print() {
//		for(T key: map.keySet()) {
//			System.out.print(key + "-->");
//			System.out.println(map.get(key));
//		}
		
		for(Entry<T, LinkedList<T>> mapElement : map.entrySet()) {
			T key = mapElement.getKey();
			System.out.print(key + "-->");
			LinkedList<T> value = mapElement.getValue();
			System.out.println(value);
		}
	}

}
