package chap13.three;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setkind(new Tv());
		product1.setmodel("스마트Tv");
		Tv tv = product1.getkind();
		String tvModel = product1.getmodel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		Product2.setKind(new Car());
		Product2.setModel("디젤");
		Car car = product2.getkind();
		String carModel = product2.getmodel();
	}

}
