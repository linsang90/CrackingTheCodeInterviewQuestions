
/* Q 5.2(pg91)
 * Author: Sang Lin	
 * Date: 08.30.2015
 */
public class RepresentDoubleInBinary {

	public static String convertor(double N) {
		if(N >= 1 || N < 0) return "ERROR";
		StringBuilder sb = new StringBuilder();
		sb.append(".");
		while(N > 0) {
			if(sb.length() > 32) return "ERROR";
			
			double r = N * 2;
			if(r >= 1) {
				sb.append(1);
				N = r - 1;
			} else {
				sb.append(0);
				N = r;
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		double d = 0.25;
		System.out.println(convertor(d));
	}
}
