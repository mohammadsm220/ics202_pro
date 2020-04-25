package ics202_pro;

import java.util.HashMap;

public class TestMain {
	public static void main(String args []){

		Trie t1=new Trie();

		String str="car";

		t1.insert(str);

		System.out.println(t1);

		t1.insert("side");
		t1.insert("sid");
		System.out.println(t1.contains("side"));

		System.out.println(t1.contains("cat"));
		t1.delete("side");
		System.out.println(t1.contains("side"));






















		//ch1
	}

}
