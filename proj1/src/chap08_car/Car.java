package chap08_car;

public class Car {
	Tire frontLeftTire = HankookTire();
	Tire frontRightTire = HankookTire();
	Tire backLeftTire = HankookTire();
	Tire backRightTire = HankookTire();
	
	
	void run() {
		frontLeftTire.roll(); 
		frontRightTire.roll();
		backLeftTire .roll();
		backRightTire.roll();	
	}


	private Tire HankookTire() {
		return null;
	}

}

