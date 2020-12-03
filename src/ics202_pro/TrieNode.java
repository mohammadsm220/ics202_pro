package ics202_pro;
import java.util.ArrayList;

import java.util.HashMap;

public class TrieNode {

	HashMap <Character , TrieNode> awlad =new HashMap <Character , TrieNode>();
	char element;
	boolean isEnd;

	TrieNode(){
		
	}



	TrieNode(char element, boolean isEnd ){

		this.element = element;

		this.isEnd=isEnd;


	}



}
