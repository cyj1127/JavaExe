package ch09.resolve07.answer04;

public class ArrayUtility2 {
	public static int [] concat(int [] s1, int [] s2) {
		int len = s1.length + s2.length;
		int [] intArr = new int [len];
		
		int cnt = 0;
		for(int i=0;i<s1.length;i++) {
			intArr[i] = s1[i];
			cnt++;
		}
		for(int i=0;i<s2.length;i++) {
			intArr[cnt] = s2[i];
			cnt++;
		}
		return intArr;
	}
	
	public static int [] remove(int [] s1, int[] s2) {
		int[] intArr = new int[s1.length];
		boolean isExist = false;
		int idx =0;
		
		
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i] == s2[j]) {
					isExist = true;
					break;
				}
			}
			if(isExist==false) {
				intArr[idx] = s1[i];
				idx++;
			}
			isExist = false;
		}
		
		int[] dest = new int[idx];
		for(int i=0;i<idx;i++) {
			dest[i] = intArr[i];
		}
		return dest;
	}
}
