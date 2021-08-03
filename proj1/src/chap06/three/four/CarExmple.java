package chap06.three.four;

public class CarExmple {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("잘못된 속도 : " + myCar.getSpeed());
		
		
		myCar.setSpeed(60);
		System.out.println("올바른 속도 : " + myCar.getSpeed());

		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("멈춤 속도 : " + myCar.getSpeed());
	}

}
