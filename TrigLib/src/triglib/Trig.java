package triglib;

public class Trig {
	
	public static final double pi = 3.141592653589793; // value of pi up to 20 decimal places
	
	// Conversion of degree to radian
	public static double degree_to_radian(double degree) {
		
		return (double)((degree*pi)/180);
		
	}
	
	// Getting Radian values between -2pi and 2pi
	public static double get_normalized_radian(double radian) {
		return (double)((radian)%(2*pi));
	}
	
	
	// sin
	public static double get_sin(double x) {
		double term = 1.0;      
        double sum  = 0.0;
        x = get_normalized_radian(x);

        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
       return sum;
		
	}
	
	//cos
	public static double get_cos(double x) {
		double term = 1.0;      
        double sum  = 1.0;
        x = get_normalized_radian(x);

        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 0) sum += term;
            if (i % 4 == 2) sum -= term;
        }
       return sum;
		
		
	}
	
	//tan 
	public static double get_tan(double angle) {
		return get_sin(angle) / get_cos(angle);
	}
	

}
