package chap03;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jum = 0;
		while(true) {
		System.out.print("점수를 입력하세요: ");
		jum = sc.nextInt();
		switch(jum/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5: case 4: case 3: case 2: case 1:
			System.out.println("E");
			break;
		}
		if(jum == -1) {
			break;
		}
	}
		sc.close();
	}
}


