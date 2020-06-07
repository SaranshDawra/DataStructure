import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;

class Graph {

	private HashMap<Integer, LinkedList<Integer>> map;

	Graph() {
		map = new HashMap<>();
	}

	public void add(int src, int dest, boolean direction) {

		if (!map.containsKey(src)) {
			map.put(src, new LinkedList<Integer>());
		}

		if (!map.containsKey(dest)) {
			map.put(dest, new LinkedList<Integer>());
		}

		map.get(src).add(dest);
		if (direction == true) {
			map.get(dest).add(src);
		}

	}

//	public void bft() {
//		T src = (T) map.keySet().toArray()[0];
//		bft(src);
//	}

	public void bft(int src, int dest) {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> set = new HashSet<>();
		HashMap<Integer, Integer> dist = new HashMap<>();
		HashMap<Integer, Integer> parent = new HashMap<>();
		System.out.println("BFS traversal starting from " + src);
		q.add(src);
		set.add(src);
		dist.put(src, 0);
		parent.put(src, -1);
		while (!q.isEmpty()) {
			int temp = q.poll();
			System.out.print(temp + "  ");
			LinkedList<Integer> list = map.get(temp);
			for (int i = 0; i < list.size(); i++) {
				if (!set.contains(list.get(i))) {
					set.add(list.get(i));
					q.add(list.get(i));
					dist.put(list.get(i), dist.get(temp) + 1);
					parent.put(list.get(i), temp);
				}
			}
		}
		System.out.println();
		System.out.println("Distance of each vertex from " + src);
		System.out.println(dist);
		System.out.println("Path from destination: " + dest +" to source: "+ src);
		System.out.println(parent);
		int p = parent.get(dest);
		int t = dest;
		System.out.print(t+" ");
		while(p != -1) {
			t = p;
			p = parent.get(p);
			System.out.print(t+" ");
		}
	}

	public void dft() {
		int src = (Integer) map.keySet().toArray()[0];
		HashSet<Integer> set = new HashSet<>();
		dft(src, set);
	}

	public void dft(int src) {
		HashSet<Integer> set = new HashSet<>();
		dft(src, set);
	}

	private void dft(int src, HashSet<Integer> set) {
		set.add(src);
		System.out.print(src + "  ");

		LinkedList<Integer> lst = map.get(src);
		for (int i = 0; i < lst.size(); i++) {
			if (!set.contains(lst.get(i))) {
				dft(lst.get(i), set);
			}
		}
	}

	public void print() {
//		for(T key: map.keySet()) {
//			System.out.print(key + "-->");
//			System.out.println(map.get(key));
//		}

		for (Entry<Integer, LinkedList<Integer>> mapElement : map.entrySet()) {
			int key = mapElement.getKey();
			System.out.print(key + "-->");
			LinkedList<Integer> value = mapElement.getValue();
			System.out.println(value);
		}
	}

}
