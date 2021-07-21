package chap10;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			int i=5;
					System.out.println(i);
			Class clazz = Class.forName("java.lang.String2");
		} catch (Exception e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
