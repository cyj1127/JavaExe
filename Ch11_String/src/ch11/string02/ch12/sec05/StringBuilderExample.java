package ch11.string02.ch12.sec05;

import java.util.ArrayList;
import java.util.List;
class MyStringBuilder{
	private List<Character> chList = new ArrayList<>();
	
	public MyStringBuilder append(String str) {
		char[] chArr = str.toCharArray();
		for(char ch : chArr)
		chList.add(ch);	//char -> Character  클래스 변환
		
		return this;
	}
	public MyStringBuilder insert(int idx, String str) {
		char[] chArr = str.toCharArray();
		for(int i=idx;i<idx+str.length();i++)
		chList.add(i, chArr[i]);
		
		return this;
	}
	@Override
	public String toString() {
		String str = "";
		for(char ch : chList)
			str += ch;
		return str;
	}
	
}
public class StringBuilderExample {
	
public static void main(String[] args) {
	
	/*StringBuilder는 내부에 char[]로 문자열을 저장한다.*/
	String data = new StringBuilder()
			.append("DEF")
			.insert(0, "ABC")
			.delete(3, 4)
			.toString();
	System.out.println(data);
	
	String data1 = new MyStringBuilder().append("def").insert(0, "abc").toString();
	System.out.println(1);
}
}
