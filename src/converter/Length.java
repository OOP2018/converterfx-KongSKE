package converter;

/**
 * Set All unit in the same value of one unit.
 * 
 * @author Varit Assavavisidchai
 *
 */
public enum Length {
	
	Mile(1609.344),
	Kilometer(1000.0),
	Meter(1.0),
	Centimeter(0.0100),
	foot(0.30480),
	wa(2.00000),
	AU(149597870700.0);
	
	// attributes of the enum numbers
	private final double value;
	
	/**
	 * Create Length
	 * 
	 * @param value
	 */
	private Length(double value) {
		this.value = value;
	}
	
	/**
	 * get a value
	 * 
	 * @return value
	 */
	public double getValue() {
		return this.value;
	}
}
