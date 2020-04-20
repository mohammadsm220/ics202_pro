package ics202_pro;

public class TestMain {
	public static void main(String srgs []){

		TrieNode node1 =new TrieNode("c",false);

		node1.nodes.add((new TrieNode("a",false)));



		System.out.println(node1.nodes.get(node1.nodes.indexOf("a")));

		//ch1
	}

}
