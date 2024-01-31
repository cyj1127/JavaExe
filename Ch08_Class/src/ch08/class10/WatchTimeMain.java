package ch08.class10;


/*메서드(함수)의 오버로딩(Overloading)
 * JAVA 는 함수의 이름은 동일하지만 매개변수가 다른 함수를 여러 개 만들 수 있다.
 * 실행할 때 매개변수의 종류에 따라 함수를 구별할 수 있기 때문에. 
 * */
public class WatchTimeMain {
	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12,13,33);
		wtNum.viewTime();
		
		WatchTime wtStr = new WatchTime("열두시","이십분","오십초");
		wtStr.viewTime();
	}
	
}
