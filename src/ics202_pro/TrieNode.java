package ics202_pro;
import java.util.ArrayList;

public class TrieNode {

	ArrayList<TrieNode> nodes;
	String element;
	boolean isEnd;

	TrieNode(){
		nodes=new ArrayList<TrieNode>();;
		element = null;
		isEnd=false;
	}

	TrieNode(String element,ArrayList<TrieNode> nodes ,boolean isEnd ){
		this.nodes=nodes;
		this.element = element;
		this.isEnd=isEnd;
	}


	TrieNode(String element, boolean isEnd ){
		this.element = element;
		System.out.println(element);
		this.isEnd=isEnd;
		System.out.println(element);
		this.nodes=new ArrayList<TrieNode>();
		System.out.println(element);
	}
}
