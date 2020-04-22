package ics202_pro;

public class TestMain {
	public static void main(String args []){

		Trie t1=new Trie();


		TrieNode node1 =new TrieNode('c',false);

		TrieNode node2 =new TrieNode('a',false);

		node1.awlad.put('a', node2);

		System.out.println(node1.awlad.get('a'));

		String str="car";

		t1.insert(str);

		System.out.println(t1);





















		//ch1
	}

}
