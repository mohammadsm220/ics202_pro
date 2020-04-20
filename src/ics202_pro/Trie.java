package ics202_pro;

public class Trie {

	 TrieNode root = new TrieNode();




	public void insert(String str){

		TrieNode index=root;

		for(int i =0 ; i<str.length() ; i++){

			String currentChar=str.charAt(i)+"";

			boolean flag= false;

			//TrieNode node = new TrieNode(currentChar,flag);




			if(! index.nodes.contains(currentChar)){

				index.nodes.add(new TrieNode(currentChar,flag));

			}

			index = index.nodes.get(index.nodes.indexOf(currentChar));

		}


	}


	public boolean contains(String s) {

		return false;
	}

}
