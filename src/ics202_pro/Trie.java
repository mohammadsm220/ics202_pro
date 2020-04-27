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

			//flag=(i==str.length()-2)? true : false;
		}
		index.isEnd=true;
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
		TrieNode index=root;
		if(! contains(str)){
			System.out.println("the word is not in the Trie");
			return false;
		}
		else{
			for(int i =0 ;i<str.length();i++){
				index=index.awlad.get(str.charAt(i));
			}
			return ! index.awlad.isEmpty();
		}

	}
	public void delete(String str){
		TrieNode index =root;
		TrieNode lastChar=new TrieNode();
		if(! contains(str)){
			System.out.println("the String is not in the Trie");
		}
		else{
			for(int i =0 ;i<str.length();i++){
				index=index.awlad.get(str.charAt(i));

				if(index.isEnd&& i!= str.length()-1){
					lastChar=index;
				}
			}
			if(! index.awlad.isEmpty()){
				index.isEnd=false;
			}
			else{
				index=root;
				if(lastChar!=null){
					for(int j=0;j<str.length();j++){
						if(index.equals(lastChar)){
							index.awlad.get(str.charAt(j)).awlad.clear();
							j=str.length()-1;
						}
						index=index.awlad.get(str.charAt(j));
					}
				}
				else{
					root.awlad.remove(str.charAt(0));
				}
			}
		}
	}
	public void clear(){
		root.awlad.clear();
	}
	public String allWordsPrefix(String str){

		TrieNode index =root;
		TrieNode x =new TrieNode();
		TrieNode y =new TrieNode();
		String allWords="",temp="",prefixWord="";
		if(! contains(str)){
			return "the word is not in the Trie";
		}
		else if(! isPrefix(str)){
			return "";
		}
		else{
			for(int i =0 ;i<str.length();i++){
				prefixWord=index.element+"";
				index=index.awlad.get(str.charAt(i));
			}
			return getprefix(index);
		}

	}

	public String getprefix(TrieNode x){
//		String temp="";
		TrieNode index=x;
		TrieNode temp=x;
		if(x.awlad.isEmpty()){
			return x.element+"";
		}
		temp=index.awlad.get(0);
		index.awlad.remove(0);
		return index.element+getprefix(temp.awlad.get(0));
	}
//		else{
//			for(int i=0 ;i<x.awlad.size();i++){
//				return x.element+getprefix(x.awlad.get(i));
//			}
//		}
	////////////////////////////////////////////////////////////////////////////////
}




