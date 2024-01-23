public class AbstractClassDemo {
	public static void main(String[] args) {
		Car car = new AudiA8EV();
		car.companyName();
		car.fuelType();
		car.noOfWheels();
	}
}
abstract class Car {
	public Car() {
		System.out.println("Car Class Constructor..");
	}
	public abstract void fuelType();
	public abstract void companyName();
	public void noOfWheels() {
		System.out.println("Car has 4 Wheels.");
	}
}

abstract class Audi extends Car {
	public void companyName() {
		System.out.println("Company Name : Audi");
	}
}

class AudiA8EV extends Audi {
	public void fuelType() {
		System.out.println("Fuel Type : Electric Car");
	}
	
}
