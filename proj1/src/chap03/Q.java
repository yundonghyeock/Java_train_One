package chap03;

public class Q {

	public boolean isStr(String number) {
		boolean flag = true;
		if(!number.matches("[a-zA-Z]+")) {
			flag = false;
			System.out.println("문자가 아님");
		}
		return false;
	}
}