package ics202_pro;

public class Trie {


	/////////////Omer Part///////////////////////////////////////////

	TrieNode root = new TrieNode();

	public void insert(String str){
		TrieNode index = root;
		boolean flag=false;
		TrieNode currentNode =null;
		for(int i =0 ; i < str.length() ; i++){
			char currentChar = str.charAt(i);
			if(!index.awlad.containsKey(currentChar)){
				currentNode= new TrieNode(currentChar,flag);
				index.awlad.put(currentChar, currentNode);
			}
			else{
				System.out.println(index.awlad.get(currentChar));
				currentNode=index.awlad.get(currentChar);
			}
			index=currentNode;
			flag=(i==str.length()-1)? true:false;
		}
	}

	public boolean contains(String str){
		return false;

	}
	public boolean isEmpty(String str){
		return false;

	}
	public int size(){
		return 0;
	}

	Trie(){

	}

	/////////////////////////////////////////////////////////////////////////////


	/////////////////////////////Mohammed Part////////////////////////////////////

	public boolean isPrefix(String str){
		return false;

	}
	public void delete(String str){


	}
	public void clear(){


	}
	public String allWordsPrefix(String str){
		return null;

	}

	////////////////////////////////////////////////////////////////////////////////
}




