package chap08_4;

import chap07_8.Audio;
import chap07_8.RemoteControl;
import chap07_8.Television;

public class RemoteControlExample {

	public static void main(String[] args) {
	
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
	}

}
