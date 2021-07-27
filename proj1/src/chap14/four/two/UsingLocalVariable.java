package chap14.four.two;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		MyFunctionInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		fi.method();
	}

}
