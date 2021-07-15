package chap03;

public class R {

	public static void main(String[] args) {
		
		System.out.println("문자를 입력해 주세요.");
		System.out.println("프로그램을 종료하려면 0를 입력하세요.");
		
		int charCode = 'A';
		charCode = System.in.read();
		if( (charCode>=65) & (charCode<=90) && (charCode>=97) & (charCode>=122)) {
			System.out.println("문자입니다.");
		}
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println("숫자 입니다.");
		} else; {
			System.out.println("특수문자 입니다.");
		}
	}

}
