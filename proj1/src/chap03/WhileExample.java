package chap03;
import java.io.IOException;
public class WhileExample {

	public static void main(String[] args) throws IOException {
		
		char chr = 1;
		while (true) {

		System.out.println("데이터 한개를 입력 : ");
		chr = (char)System.in.read();
		System.in.skip(2);
		
		System.out.println(chr);
		
		if(chr>='1'&& chr<='9'){
			System.out.println("숫자입니다.");
		
		}else if((chr>='a'&& chr<='z') || (chr>='A'&& chr<='Z')) {
			System.out.println("문자입니다.");
			
		}else if (chr == '0'){
			System.out.println("종료합니다.");
			break;
		} 
		else {
			System.out.println("특수문자 입니다.");
		}
	}
	}
}
