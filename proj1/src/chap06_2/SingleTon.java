package chap06_2;

public class SingleTon {
	
	private static SingleTon singleton = new SingleTon();
	private SingleTon() {
		
	}
		static SingleTon getInstance() {
		return singleton;
	}
}

