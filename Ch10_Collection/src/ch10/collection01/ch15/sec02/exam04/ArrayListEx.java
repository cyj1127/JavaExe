package ch10.collection01.ch15.sec02.exam04;

import java.util.ArrayList;
import java.util.List;

/*  
 * ArrayList 는 배열로 구성되어있다.
 * 다만 배열보다 나은 점은 데이터가 배열을 꽉 채우면 알아서 내부 공간을 늘려준다.
 * 그리고 <> 사이에 어떤 자료형을 넣느냐에 따라 해당 자료형을 저장할 수 있다.
 * 
 * List 인터페이스를 상속받았고 List 계열 클래스는 List 로 변수를 저장해서 사용한다.
 * 
 * 리스트의 가장 큰 특징은 '순서가 보장된다' > 같은 값을 두 번 넣어도 순서가 다르기에 등록이 잘 된다.
 * ArrayList의 가장 큰 특징은 내부가 배열로 이루어져있다는 것.
 * 다만, 배열의 크기를 자동으로 늘려준다.
 * 
 * ArrayList 특징
 *삽입, 삭제가 자주 일어나지 않거나 >> 중간 삽입시 모든 데이터를 뒤로 하나씩 미루고, 삭제시에 하나씩 전부 당김.
 *데이터의 양이 많지 않을 때 사용한다.
 *
 *But !! 데이터의 양이 많고, 읽기 전용인 경우 그리고 순차 검색인 경우는 가장 빠른 성능을 보여준다.
 *(쉽게 말해 변동 없이 단순히 출력만 해야하는 경우..)
*/
public class ArrayListEx {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();

		nameList.add("홍길동");
		nameList.add("임꺽정");
		nameList.add("장길산");
		nameList.add("일지매");
		nameList.add("차돌바위");
		
		System.out.println(nameList.size());
		System.out.println(nameList.get(2));
		System.out.println();

		// 전체 출력

		for (int i = 0; i < nameList.size(); i++)
			System.out.print(nameList.get(i) + " ");
		System.out.println();

		nameList.add(2, "머털이");// index 2에 중간 삽입

		// 전체 출력
		for (int i = 0; i < nameList.size(); i++)
			System.out.print(nameList.get(i) + " ");
		System.out.println();

		nameList.remove(1); // index 1을 삭제

		// forEach문 사용 가능
		for (String name : nameList)
			System.out.print(name + " ");
		System.out.println();

	}
}
