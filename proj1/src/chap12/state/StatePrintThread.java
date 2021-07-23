package chap12.state;

public class StatePrintThread extends Thread{
	private Thread targetThead;

	public StatePrintThread(Thread targetThread) {
		this.targetThead = targetThread;
	}		

	public void run() {
		while (true) {
			Thread.State state = targetThead.getState();
			System.out.println("타겟 스레드 상태: " + state);

			if(state == Thread.State.NEW) {
				targetThead.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
