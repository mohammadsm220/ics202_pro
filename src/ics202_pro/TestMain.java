package ics202_pro;
import java.util.HashMap;
public class TestMain {
	public static void main(String args []){

		Trie t1=new Trie();

		String str="car";

		t1.insert(str);

		t1.insert("sided");
		System.out.println(t1.contains("sided"));
		t1.insert("sid");
		t1.delete("sided");;
		System.out.println(t1.contains("sided"));
		 System.out.println(t1.allWordsPrefix("sid"));
		//ch1
	}

}
