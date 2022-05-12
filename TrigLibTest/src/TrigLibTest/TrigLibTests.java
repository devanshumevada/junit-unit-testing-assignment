package TrigLibTest;

import static triglib.Trig.*;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TrigLibTests {
	
	@Test
	public void degree_to_radian_test_1() {
		double value_1 = Math.toRadians(70);
		double value_2 = degree_to_radian(70);
		System.out.println("Value - 1: " + value_1 + " Value - 2: " + value_2 );
		assertEquals(value_1, value_2, 0.00001);
	}
	
	@Test
	public void degree_to_radian_test_2() {
		double value_1 = Math.toRadians(-240);
		double value_2 = degree_to_radian(-240);
		System.out.println("Value - 1: " + value_1 + " Value - 2: " + value_2 );
		assertEquals(value_1, value_2, 0.00001);
	}
	
	@Test
	public void normalize_radian_test_1() {
		double value_1 = 1.22173;
		double value_2 = Math.toRadians(70);
		System.out.println("Value - 1: " + value_1 + " Value - 2: " + value_2 );
		assertEquals(value_1, value_2, 0.00001);
		
	}
	
	@Test
	public void normalize_radian_test_2() {
		double value_1 = -5.75959;
		double value_2 = Math.toRadians(-330);
		System.out.println("Value - 1: " + value_1 + " Value - 2: " + value_2 );
		assertEquals(value_1, value_2, 0.00001);
	}
	
	@Test
	public void cos_test_1() {
		double value_1 = Math.cos(Math.toRadians(70));
		double value_2 = get_cos(Math.toRadians(70));
		System.out.println("Value - 1: " + value_1 + " Value - 2: " + value_2 );
		assertEquals(value_1, value_2, 0.00001);
	}
	
	
	
	@Test
	public void cos_test_2() {
		double value_1 = Math.cos(Math.toRadians(30));
		double value_2 = get_cos(Math.toRadians(30));
		System.out.println("Value - 1: " + value_1 + " Value - 2: " + value_2 );
		assertEquals(value_1, value_2, 0.00001);
	}
	
	@Test
	public void cos_test_3() {
		double value_1 = Math.cos(-1.27);
		double value_2 = get_cos(-1.27);
		System.out.println("Value - 1: " + value_1 + " Value - 2: " + value_2 );
		assertEquals(value_1, value_2, 0.00001);
	}
	
	@Test
	public void sin_test_1() {
		double value_1 = Math.sin(Math.toRadians(70));
		double value_2 = get_sin(Math.toRadians(70));
		System.out.println("Value - 1: " + value_1 + " Value - 2: " + value_2 );
		
		assertEquals(value_1, value_2, 0.00001);
	}
	
	@Test
	public void sin_test_2() {
		double value_1 = Math.sin(Math.toRadians(30));
		double value_2 = get_sin(Math.toRadians(30));
		System.out.println("Value - 1: " + value_1 + " Value - 2: " + value_2 );
		assertEquals(value_2, value_2, 0.00001);
	}
	
	@Test
	public void sin_test_3() {
		double value_1 = Math.sin(-1.27);
		double value_2 = get_sin(-1.27);
		System.out.println("Value - 1: " + value_1 + " Value - 2: " + value_2 );
		assertEquals(value_1, value_2, 0.00001);
	}
	
	@Test
	public void tan_test_1() {
		double value_1 = Math.tan(Math.toRadians(70));
		double value_2 = get_tan(Math.toRadians(70));
		System.out.println("Value - 1: " + value_1 + " Value - 2: " + value_2 );
		assertEquals(value_1, value_2, 0.00001);
	}
	
	@Test
	public void tan_test_2() {
		double value_1 = Math.tan(Math.toRadians(30));
		double value_2 = get_tan(Math.toRadians(30));
		System.out.println("Value - 1: " + value_1 + " Value - 2: " + value_2 );
		assertEquals(value_1, value_2, 0.00001);
	}
	
	@Test
	public void tan_test_3() {
		double value_1 = Math.tan(-1.27);
		double value_2 = get_tan(-1.27);
		System.out.println("Value - 1: " + value_1 + " Value - 2: " + value_2 );
		assertEquals(value_1, value_2, 0.00001);
	}
	
	
	
	


}
