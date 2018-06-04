package examples.vanita.designpatterns.creational.builder;

public class BillPughSingleton {

	private BillPughSingleton() {
		
	}

	private static class Initializer {
		private static BillPughSingleton bps = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return Initializer.bps;
	}
	
	//USAGE -
	//BillPughSingleton.getInstance();
}
