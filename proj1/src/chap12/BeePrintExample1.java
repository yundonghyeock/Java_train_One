package chap12;

import java.awt.Toolkit;

public class BeePrintExample1{

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch (Exception e) {
			}
		for(int i1=0; i1<5; i1++) {
			System.out.println("띵");
			try {Thread.sleep(500); } catch (Exception e) {
			}
		}
	}
}
}
