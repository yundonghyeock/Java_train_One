package chap08.five;

import chap07.eight.RemoteControl;
import chap07.eight.Television;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc = null;
				
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
	}

}
