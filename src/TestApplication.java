
public class TestApplication {

	public static void main(String[] args) {
		
		Movable bugattieVeyronUs = new BugattieVeyron();
		System.out.println("Top Speed of Luxury Car Bugattie in US: " + bugattieVeyronUs.getSpeed() + " MPH");
		
		// new line
		System.out.println();
		
		MovableAdapter bugattieVeyronsUk = new MovableAdapterImpl();
		System.out.println("Top Speed of Luxury Car Bugattie in UK: " + bugattieVeyronsUk.getSpeed() + " (km/h)");

	}

}
