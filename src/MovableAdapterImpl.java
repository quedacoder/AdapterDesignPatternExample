/**
 * 
 */

/**
 * @author quedacoder
 * 
 * The implementation of this call will include a converter
 * method
 */
public class MovableAdapterImpl implements MovableAdapter {
	
	private static final double KILOMETER_PER_HOUR = 1.60934;
	private Movable luxuryCars = new BugattieVeyron();

	@Override
	public double getSpeed() {
		
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}
	
	private double convertMPHtoKMPH(double mph) {
		return mph * KILOMETER_PER_HOUR;
	}

}
