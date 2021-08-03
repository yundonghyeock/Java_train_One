package chap07.eight;

public abstract class Cat extends Animal{
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
