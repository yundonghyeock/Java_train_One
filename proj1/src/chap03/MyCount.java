package chap03;

public class MyCount {

	public static void main(String[] args) {
		int i=9;
		for(int j=0; j<9; j++) {
			System.out.println(i + " * " + (j+1) + " =" + (i*(j+1)));
		}
		if(i==5) {
			System.out.println(i);
		}
	}

}
