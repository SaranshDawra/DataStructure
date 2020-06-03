import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;

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

	public void bft() {
		T src = (T) map.keySet().toArray()[0];
		bft(src);
	}

	public void bft(T src) {
		Queue<T> q = new LinkedList<>();
		HashSet<T> set = new HashSet<>();
		q.add(src);
		set.add(src);
		while (!q.isEmpty()) {
			T temp = q.poll();
			System.out.print(temp + "  ");
			LinkedList<T> list = map.get(temp);
			for (int i = 0; i < list.size(); i++) {
				if (!set.contains(list.get(i))) {
					set.add(list.get(i));
					q.add(list.get(i));
				} 
			}
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
