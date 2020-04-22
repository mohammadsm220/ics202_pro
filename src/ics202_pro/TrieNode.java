package ics202_pro;
import java.util.ArrayList;

public class TrieNode {

	ArrayList<TrieNode> nodes;
	String element;
	boolean isEnd;
	int letterOreder;

	TrieNode(){
		nodes=new ArrayList<TrieNode>();;
		element = null;
		isEnd=false;
	}

	TrieNode(String element,ArrayList<TrieNode> nodes ,boolean isEnd ){
		this.nodes=nodes;
		this.element = element;
		this.isEnd=isEnd;

		letterOreder =decideOrder(element);

		/*String letter=element.toLowerCase();

		switch (letter) {
        case "a":
        	letterOreder = 1;
            break;
        case "b":
        	letterOreder = 2;
            break;
        case "c":
        	letterOreder = 3;
            break;
        case "d":
        	letterOreder = 4;
            break;
        case "e":
        	letterOreder = 5;
            break;
        case "f":
        	letterOreder = 6;
            break;
        case "g":
        	letterOreder = 7;
            break;
        case "h":
        	letterOreder = 8;
            break;
        case "i":
        	letterOreder = 9;
            break;
        case "j":
        	letterOreder = 10;
            break;
        case "k":
        	letterOreder = 11;
            break;
        case "l":
        	letterOreder = 12;
            break;
        case "m":
        	letterOreder = 13;
            break;
        case "n":
        	letterOreder = 14;
            break;
        case "o":
        	letterOreder = 15;
            break;
        case "p":
        	letterOreder = 16;
            break;
        case "q":
        	letterOreder = 17;
            break;
        case "r":
        	letterOreder = 18;
            break;
        case "s":
        	letterOreder = 19;
            break;
        case "t":
        	letterOreder = 20;
            break;
        case "u":
        	letterOreder = 21;
            break;
        case "v":
        	letterOreder = 22;
            break;
        case "w":
        	letterOreder = 23;
            break;
        case "x":
        	letterOreder = 24;
            break;
        case "y":
        	letterOreder = 25;
            break;
        case "z":
        	letterOreder = 26;
            break;
        default:
        	letterOreder = 0;
            break;
        } */

    }




	TrieNode(String element, boolean isEnd ){
		this.element = element;
		System.out.println(element);
		this.isEnd=isEnd;
		System.out.println(element);
		this.nodes=new ArrayList<TrieNode>();
		System.out.println(element);


		letterOreder =decideOrder(element);

	}

	private int decideOrder(String letter){
		int x=0;
		switch (letter) {
        case "a":
        	x = 1;
            break;
        case "b":
        	x = 2;
            break;
        case "c":
        	x = 3;
            break;
        case "d":
        	x = 4;
            break;
        case "e":
        	x = 5;
            break;
        case "f":
        	x = 6;
            break;
        case "g":
        	x = 7;
            break;
        case "h":
        	x = 8;
            break;
        case "i":
        	x = 9;
            break;
        case "j":
        	x = 10;
            break;
        case "k":
        	x = 11;
            break;
        case "l":
        	x = 12;
            break;
        case "m":
        	x = 13;
            break;
        case "n":
        	x = 14;
            break;
        case "o":
        	x = 15;
            break;
        case "p":
        	x = 16;
            break;
        case "q":
        	x = 17;
            break;
        case "r":
        	x = 18;
            break;
        case "s":
        	x = 19;
            break;
        case "t":
        	x = 20;
            break;
        case "u":
        	x = 21;
            break;
        case "v":
        	x = 22;
            break;
        case "w":
        	x = 23;
            break;
        case "x":
        	x = 24;
            break;
        case "y":
        	x = 25;
            break;
        case "z":
        	x = 26;
            break;
        default:
        	x = 0;
            break;

        }
		return x;
	}

}
