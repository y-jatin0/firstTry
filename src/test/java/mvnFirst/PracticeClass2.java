package mvnFirst;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class PracticeClass2 {

	public static void main(String[] args) {
		String word = "amazonaanazzz ";
		System.out.println(word.indexOf("a"));
		System.out.println(word.lastIndexOf("a"));
		
		 ArrayList<Integer> list = new ArrayList<>();
		for(int i =0;i<word.length();i++) {
			if(word.charAt(i)=='a') {
				list.add(i);
			}
		}
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));

	}

}
