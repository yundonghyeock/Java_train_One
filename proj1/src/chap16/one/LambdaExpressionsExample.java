package chap16.one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import chap16.one.Student;

public class LambdaExpressionsExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("신용권", 92)
		);
		
		Stream<Student> stream = list.stream();
		stream.forEach( s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
	}

}
