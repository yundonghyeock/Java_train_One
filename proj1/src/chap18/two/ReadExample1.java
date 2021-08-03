package chap18.two;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:\\temp\\text.txt");
		int readData;
		while (true) {
			readData = reader.read();
			if (readData == -1)break;
				System.out.println((char)readData);
			
		}
		reader.close();
	}
}
