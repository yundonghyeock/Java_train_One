package chap10;


public class ThrowsExample {

	public static void main(String[] args) {
		try {
			FindClass();
		}catch (ClassNotFoundException e){
			System.out.println("클레스가 존재하지 않습니다.");
		}
	}

	private static void FindClass()throws ClassNotFoundException{
		Class clazz = Class.forName("Java.lang.String2");		
	}
}
