package chap18.two;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:\\temp\\text.txt");
		char[] data = "나를 홍길동이라 부르지 마".toCharArray();
		for (int i=0; i<data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}
}
