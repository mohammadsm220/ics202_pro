package ics202_pro;

import java.util.Scanner;

public class Main {
	public static void main(String args []){
		int x=0;
		Scanner input =new Scanner(System.in);
		System.out.println("Do you want to create a trie?\nEnter yes or no:");
		String A1= input.next();
		if(A1.equalsIgnoreCase("yes")){
			Trie t1 =new Trie();
			System.out.println("trie has been created!");
			while(x==0){
			System.out.println( "choose one of the follwoing options by entering the number:\n"
					+ "1-Insert a word to the tree\n"
					+ "2-Delete a word from the tree\n"
					+ "3-List all words that begin with a prefix\n"
					+ "4-Size of the trie\n"
					+ "5-End program");
			String A2= input.next();
			if(A2.equalsIgnoreCase("1")){
				System.out.println("Enter the word you like do insert:");
				String A21= input.next();
				t1.insert(A21);
			}
			if(A2.equalsIgnoreCase("2")){
				System.out.println("Enter the word you like do delete:");
				String A21= input.next();
				t1.delete(A21);
			}
			if(A2.equalsIgnoreCase("3")){
				System.out.println("Enter the prefix:");
				String A21= input.next();
				t1.allWordsPrefix(A21);
			}
			if(A2.equalsIgnoreCase("4")){
				System.out.println(t1.size);
			}
			if(A2.equalsIgnoreCase("5")){
				System.out.println("Program Ended, Thank you");
				System.exit(0);
			}


			}
		}else{
			System.out.println("Program Ended, Thank you");
			System.exit(0);
		}


	}

}
