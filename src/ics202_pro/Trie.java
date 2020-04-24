package ics202_pro;

public class Trie {

	TrieNode root = new TrieNode();


	/////////////Omer Part///////////////////////////////////////////



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
			flag=(i==str.length()-1)? true : false;
		}
	}

	public boolean contains(String str){
		TrieNode index =root;
		TrieNode currentNode =null;
		for(int i =0 ;i<str.length(); i++){
			char currentChar = str.charAt(i);
			currentNode=index.awlad.get(currentChar);
			if(currentNode==null){
				return false;
			}else{
				index=currentNode;
			}
		}

		return index.isEnd;

	}
	public boolean isEmpty(){
		return root.awlad.isEmpty();

	}
	public int size(){

		TrieNode index =root;

		if(index.awlad==null)
			return 0;
		else{
			return 0;
		}


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




