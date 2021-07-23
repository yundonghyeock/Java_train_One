package chap12;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized //공유객체
	void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
