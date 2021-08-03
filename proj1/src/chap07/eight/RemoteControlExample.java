package chap07.eight;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.setMute(false);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
	}

}
