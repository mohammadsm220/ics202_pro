package ics202_pro;

public class Trie {

	int size;

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
				this.size++;
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
		return this.size;
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
-			if(! index.awlad.isEmpty()){
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
				
					root.awlad.remove(str.charAt(0));
				
			}
		}
	}
	public void clear(){
		root.awlad.clear();
		this.size=0;
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
			return "the word is not a prefix";
		}
		else{
			for(int i =0 ;i<str.length();i++){
				prefixWord=index.element+"";
				index=index.awlad.get(str.charAt(i));
			}
			System.out.println(index.element);
			return getprefix(index,1);
		}

	}

	public String getprefix(TrieNode index,int node){
		System.out.println(index.element);
		if(index == null){
			return " ";
		}
		else if(index.awlad.isEmpty()){
			return index.element+"";
		}
		else if(index.awlad.size()-node>1){

			return index.element+getprefix(index.awlad.get(node),0)+getprefix(index,node+1);
		}else{
			return index.element+getprefix(index.awlad.get(node),node);
		}
	}

	////////////////////////////////////////////////////////////////////////////////
}




