package chap06;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("더하기: " + result1);
		
		byte x = 10;
		byte y = 4;
		float result2 = myCalc.divide(x, y);
		System.out.println("나누기: " + result2);
		myCalc.powerOff();
	}

}
