package chap06;

public class Car {
	
	String name;
	int value;
	
	Car(){
		System.out.println("나 카생성자야");
	}
	Car(String color, int cc) {
		name = color;
		value = cc;
	}

}
