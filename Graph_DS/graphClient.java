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
		
		graph.add(0, 1, false); 
		graph.add(0, 2, false); 
		graph.add(1, 2, false); 
		graph.add(2, 0, false); 
		graph.add(2, 3, false); 
		graph.add(3, 3, false);
		
//		graph.print();
//		graph.bft(4);
//		System.out.println();
		graph.bft();
		System.out.println();
		graph.dft(2);

	}

}
