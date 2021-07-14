package chap03;
import java.util.Scanner;
public class JavaStudy {

	public static void main(String[] args) {
		int i, mok, nmg;
		 int n = 2; // 스위치 제어문 변수
		 int temp = 50000; // 지폐, 동전 단위

		 Scanner num = new Scanner(System.in);
		 System.out.print("금액 입력 : ");

		 i = num.nextInt();
		 do {
		 switch (n) {
		 case 2:
		 mok = i / temp;
		 nmg = i % temp;
		 System.out.println(temp + "원 :" + mok + "개");
		 i = i - mok * temp;
		 temp = temp / 5;
		 n = 5;
		 case 5:
		 mok = i / temp;
		 nmg = i % temp;
		 System.out.println(temp + "원 :" + mok + "개");
		 i = i - mok * temp;
		 temp = temp / 2;
		 n = 2;
		 }
		 } while (temp >= 10);// 10원단위까지만
		 }
		}