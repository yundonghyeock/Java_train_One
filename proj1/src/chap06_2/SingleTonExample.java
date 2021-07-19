package chap06_2;

public class SingleTonExample {

	public static void main(String[] args) {
		
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();

		if(obj1 == obj2) {
			System.out.println("싱글톤이다.");
		}else {
			System.out.println("싱글톤이 아니다.");
		}
	}

}
