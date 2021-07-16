package chap06;

public class Calculator {
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	int plus(int x, int y) {
		int result = x +y;
		return result;
	}
	
	float divide(int x, int y) {
		float result = ((float)x / (float)y);
		return result;
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");

}
}