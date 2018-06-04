package examples.vanita.designpatterns.creational.builder;
/*https://www.journaldev.com/1425/builder-design-pattern-in-java*/
public class TestBuilderPattern {

	public static void main(String[] args) {
	
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true)
				.build();
	}
}
