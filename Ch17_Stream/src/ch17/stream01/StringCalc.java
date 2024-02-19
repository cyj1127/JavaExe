package ch17.stream01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringCalc {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList();
		nameList.add("홍길동");
		nameList.add("알렉산드라");
		nameList.add("리산드라");
		nameList.add("리신");
		nameList.add("Isu");
		
		for(String name : nameList) {
			if(name.length() >= 5) {
				System.out.println(name + ", ");
			}
		}
		System.out.println();
		
		Stream<String> strm = nameList.stream();
		Stream<String> strmF = strm.filter(s -> s.length() >= 5);
		strmF.forEach(s->System.out.println(s + ", "));
		nameList.stream()						//1)스트림객체
				.filter(s -> s.length() >= 5)	//2)중간연산(참일 때 새로운 스트림)
				.forEach(s->System.out.println(s + ", "));//최종연산
	}
}
