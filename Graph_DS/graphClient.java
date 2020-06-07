public class graphClient {

	public static void main(String[] args) {
		Graph graph = new Graph();
//		graph.add(0, 1, true);
//		graph.add(0, 2, true);
//		graph.add(1, 2, true);
//		graph.add(2, 3, true);
//		graph.add(1, 4, true);
//		graph.add(3, 4, true);
//		graph.add(5, 4, true);
//		graph.add(5, 3, true);
//		graph.add(0, 5, true);
		
		graph.add(0, 1, true);
		graph.add(1, 2, true);
		graph.add(0, 4, true);
		graph.add(2, 4, true);
		graph.add(3, 2, true);
		graph.add(3, 5, true);
		graph.add(3, 4, true);
		
//		graph.add(0, 1, false); 
//		graph.add(0, 2, false); 
//		graph.add(1, 2, false); 
//		graph.add(2, 0, false); 
//		graph.add(2, 3, false); 
//		graph.add(3, 3, false);
		
		graph.print();
		System.out.println("DFS");
		graph.dft(2);
		System.out.println();
		System.out.println("BFS");
		graph.bft(0, 5);
		
	}

}
