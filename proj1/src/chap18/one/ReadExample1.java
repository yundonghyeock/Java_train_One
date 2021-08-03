package chap18.one;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\temp\\text.txt");
		int readByte;
		byte[]readBytes = new byte[3];
		while (true) {
			readByte = is.read(readBytes);
			if(readByte == -1)break;
			System.out.println((char)readByte);
			
		}
		is.close();
	}

}
