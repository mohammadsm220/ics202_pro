package ics202_pro;

public class Trie {

	 TrieNode root = new TrieNode();




	public void insert(String str){

		TrieNode index=root;

		for(int i =0 ; i<str.length() ; i++){

			String currentChar=str.charAt(i)+"";

			boolean flag= false;





			if(! index.nodes.contains(currentChar)){

				TrieNode node = new TrieNode(currentChar,flag);

				index.nodes.add(node);



			}

			index = index.nodes.get(node);

		}


	}


	public boolean contains(String s) {

		return false;
	}

}
