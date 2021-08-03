package chap18.one;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:\\temp\\text.txt");
		byte[] data = "ABCDEF".getBytes();
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();
	}
}
