package ch11.string03;

public class StringVsStringBuilderEx {
	
	public static long getStringSpeed() {
		
		String str = "";
		for(int i=0;i<=25;i++)
			str += (char)('a' + i);
		System.out.println("String: " + str	);
		return 0;
	}
	public static long getStringBuilderSpeed() {
		StringBuilder strBuilder = new StringBuilder(26);
		for(int i=0;i<=25;i++)
			strBuilder.append((char)('a' + i));
		System.out.println("strBuilder: "+ strBuilder.toString());
		return 0;
	}
	
public static void main(String[] args) {
	getStringSpeed();
	getStringBuilderSpeed();
}
}
