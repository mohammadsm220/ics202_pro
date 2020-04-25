package ics202_pro;

public class Trie {

	TrieNode root = new TrieNode();


	/////////////Omer Part///////////////////////////////////////////



	/*public void insert(String str){
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
				currentNode=index.awlad.get(currentChar);
			}
			index=currentNode;
			index.isEnd=true;
			//flag=(i==str.length()-2)? true : false;
		}
	}*/
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
				currentNode=index.awlad.get(currentChar);
			}
			index=currentNode;
			index.isEnd=true;
			//flag=(i==str.length()-2)? true : false;
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
		TrieNode index =root;
		TrieNode lastWord=new TrieNode();
		for(int i =0 ;i<str.length();i++){
			index=index.awlad.get(str.charAt(i));
			if(index.isEnd&& i!=str.length()-1){
				lastWord=index;
			}
		}
		if(! index.awlad.isEmpty()){
		index.isEnd=false;	
		}
		else{
			index=root;
			for(int j=0;j<str.length();j++){
				if(index.equals(lastWord)){
					index.awlad.remove(str.charAt(j+1)); 
				}
				index=index.awlad.get(str.charAt(j));
			}
		}
	

	}
	public void clear(){


	}
	public String allWordsPrefix(String str){
		return null;

	}

	////////////////////////////////////////////////////////////////////////////////
}




