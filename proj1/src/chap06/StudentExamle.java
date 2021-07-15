package chap06;

public class StudentExamle {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");

		s1.aaa();
		s1.bbb();

		Student s2 = new Student();
		System.out.println("s2 변수가 Student 객체를 참조합니다.");
		
		
		Student s3 = new Student();
		System.out.println("s3 변수가 Student 객체를 참조합니다.");
		
	}

}
