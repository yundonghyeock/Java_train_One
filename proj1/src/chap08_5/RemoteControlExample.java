package chap08_5;

import chap07_8.RemoteControl;
import chap07_8.Television;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl rc = null;
				
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
	}

}
