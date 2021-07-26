package chap13.three;

public class Product2<T, M> {
	private T kind; 
	private M model;
	
	public T getkind() { return this.kind; }
	public M getmodel() { return this.model; }
	
	public void setkind(T kind) { this.kind = kind; }
	public void setmodel(M model) { this.model = model; }
	
	public static void setKind(Car car) {
		// TODO Auto-generated method stub
		
	}
	public static void setModel(String string) {
		// TODO Auto-generated method stub
		
	}

}

