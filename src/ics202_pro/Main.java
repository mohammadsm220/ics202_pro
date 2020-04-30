package ics202_pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String args []) throws FileNotFoundException{
		int x=0;
		Scanner input =new Scanner(System.in);
		System.out.println("Do you want to create a trie?\nEnter yes or no:");
		String A1= input.next();
		if(A1.equalsIgnoreCase("yes")){
			Trie t1 =new Trie();
			System.out.println("an empty trie has been created!");
			while(x==0){
			System.out.println("choose one of the follwoing options by entering the number:\n"
					+ "1-Insert a word to the trie\n"
					+ "2-Delete a word from the trie\n"
					+ "3-List all words that begin with a prefix\n"
					+ "4-Size of the trie\n"
					+ "5-fill the trie with all words in the dictionary in capital letters\n"
					+ "6-see of the trie contains a word?\n"
					+ "7-clear the trie\n"
					+ "8-End program");
			String A2= input.next();
			if(A2.equalsIgnoreCase("1")){
				System.out.println("Enter the word you like do insert:");
				String A21= input.next();
				t1.insert(A21);
				System.out.println("the word"+A21+"has been inserted");
			}
			if(A2.equalsIgnoreCase("2")){
				System.out.println("Enter the word you like do delete:");
				String A21= input.next();
				t1.delete(A21);
				System.out.println("the word"+A21+"has been deleted");
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
				Scanner wordInput =new Scanner(new FileInputStream("dec.txt"));
				while(wordInput.hasNext())
					t1.insert(wordInput.next());
				System.out.println("trie has been filled with all words in the dictionary inserted!");
			}
			if(A2.equalsIgnoreCase("6")){
				System.out.println("Enter the word you want to check for:");
				String A21= input.next();
				if(t1.contains(A21))
					System.out.println("The word is in the trie!");
				else
					System.out.println("Tho word is not in the trie!");
			}
			if(A2.equalsIgnoreCase("7")){
				t1.clear();
				System.out.println("The trie now is empty!");
			}
			if(A2.equalsIgnoreCase("8")){
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
