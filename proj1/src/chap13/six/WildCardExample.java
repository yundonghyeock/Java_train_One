package chap13.six;

import java.util.Arrays;

public class WildCardExample {

	public static void registersCourse (Course<?> Course) {
		System.out.println(Course.getName() + "수강생: " + 
	Arrays.toString(Course.getstudents()));		
	}
	
	public static void registersCourseStudents( Course<? extends Student> course ){
		System.out.println(course.getName() + " 수강생: " +
	Arrays.toString(course.getstudents()) );
	}
	
	public static void registersCourseWorker( Course<? super Worker> course ){
		System.out.println(course.getName() + " 수강생: " +
	Arrays.toString(course.getstudents()) );
	}
	
	public static void main(String[] args){
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
	Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
	//workerCourse.add(new Worker("직장인"));
	
	Course<Student> StudentCourse = new Course<Student>("학생과정", 5);
	workerCourse.add(new Student("학생"));
	workerCourse.add(new HighStudent("고등학생"));
	
	
	Course<HighStudent> HighStudentCourse = 
			new Course<HighStudent>("고등학생과정", 5);
	workerCourse.add(new HighStudent("고등학생"));
	
	registersCourse(personCourse);
	registersCourse(workerCourse);
	registersCourse(StudentCourse);
	registersCourse(HighStudentCourse);
	System.out.println();

	//registersCourseStudents(personCourse);
	//registersCourseStudents(workerCourse);
	/*registersCourseStudents(workerCourse);
	registersCourseStudents(HighStudentCourse);
	System.out.println();
	
	registersCourseWorker(personCourse);*/
	registersCourseWorker(workerCourse);
	//registersCourseStudents(workerCourse);
	//registersCourseStudents(HighStudentCourse);
	System.out.println();
	}
}