package ics202_pro;
import java.util.ArrayList;

public class TrieNode {

	ArrayList<TrieNode> nodes;
	String element;
	boolean isEnd;
	TrieNode(){
		nodes=null;
		element = null;
		isEnd=false;
	}

	TrieNode(String element,ArrayList<TrieNode> nodes ,boolean isEnd ){
		this.nodes=nodes;
		this.element = element;
		this.isEnd=isEnd;
	}
}
