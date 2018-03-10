package converter;

/**
 * Test class
 * 
 * @author Varit Assavavisidchai
 *
 */
public class test {
	
	public static void main(String[] args) {
		// example how to get the values
		Length[] lengths = Length.values();
		// use the values
		for (Length l : lengths) {
			System.out.println(l.toString() + " = " + l.getValue());
		}
	}
}
