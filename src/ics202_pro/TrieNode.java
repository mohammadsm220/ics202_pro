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

	/*TrieNode(String word){

		for(int i=0; i<word.length(); i++){
			this.awlad.put(word.charAt(i), new TrieNode());
		}

		this.isEnd=true;

		this.awlad= new HashMap <Character , TrieNode>();
	}*/



















//	private int decideOrder(String letter){
//		int x=0;
//		switch (letter) {
//        case "a":
//        	x = 1;
//            break;
//        case "b":
//        	x = 2;
//            break;
//        case "c":
//        	x = 3;
//            break;
//        case "d":
//        	x = 4;
//            break;
//        case "e":
//        	x = 5;
//            break;
//        case "f":
//        	x = 6;
//            break;
//        case "g":
//        	x = 7;
//            break;
//        case "h":
//        	x = 8;
//            break;
//        case "i":
//        	x = 9;
//            break;
//        case "j":
//        	x = 10;
//            break;
//        case "k":
//        	x = 11;
//            break;
//        case "l":
//        	x = 12;
//            break;
//        case "m":
//        	x = 13;
//            break;
//        case "n":
//        	x = 14;
//            break;
//        case "o":
//        	x = 15;
//            break;
//        case "p":
//        	x = 16;
//            break;
//        case "q":
//        	x = 17;
//            break;
//        case "r":
//        	x = 18;
//            break;
//        case "s":
//        	x = 19;
//            break;
//        case "t":
//        	x = 20;
//            break;
//        case "u":
//        	x = 21;
//            break;
//        case "v":
//        	x = 22;
//            break;
//        case "w":
//        	x = 23;
//            break;
//        case "x":
//        	x = 24;
//            break;
//        case "y":
//        	x = 25;
//            break;
//        case "z":
//        	x = 26;
//            break;
//        default:
//        	x = 0;
//            break;
//
//        }
//		return x;
//	}

}
