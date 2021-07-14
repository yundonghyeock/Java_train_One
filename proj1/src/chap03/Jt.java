package chap03;

//import com.sun.tools.sjavac.server.SysInfo;

public class Jt {

	public static void main(String[] args) throws java.io.IOException 
	{
	int ken;
	System.out.print("10진수를 입력하세요 :");
	ken = System.in.read();
	System.out.println("2진수 :" +Integer.toBinaryString(ken));
	System.out.println("8진수 :" +Integer.toOctalString(ken));
	System.out.println("16진수 :" +Integer.toHexString(ken));
	
	}

}
