public class graphClient {

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.add(0, 1, true);
		graph.add(0, 2, true);
		graph.add(1, 2, true);
		graph.add(2, 3, true);
		graph.add(1, 4, true);
		graph.add(3, 4, true);
		
		graph.print();

	}

}
