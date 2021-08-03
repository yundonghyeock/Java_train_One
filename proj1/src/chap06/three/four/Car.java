package chap06.three.four;

public class Car {
	
	private int speed;
	private boolean stop;
	
	Car(){}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed<0) {
		this.speed = speed = 0;
	}else {
		this.speed = speed;
	}
}
	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
	
}
