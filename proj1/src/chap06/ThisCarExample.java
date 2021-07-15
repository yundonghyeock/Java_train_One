package chap06;

public class ThisCarExample {

	public static void main(String[] args) {
		ThisCar myCar = new ThisCar("포르쉐");
		ThisCar youCar = new ThisCar("벤츠");
		
		myCar.run();
		System.out.println();
		youCar.run();
		
	}

}
