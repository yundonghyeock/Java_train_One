package chap08;

public class RemoteControlExample2 {
	public static void main(String[] args) {
		RemoteControl rc =new RemoteControl() {
			public void turnOn() {/* 실행문 */}
			public void turnOff() {/* 실행문 */}
			public void setVolume(int volume) {/* 실행문 */}
		};
	}

}
