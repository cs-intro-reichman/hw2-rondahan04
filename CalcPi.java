// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		Double pie = Math.PI;
		int counter = Integer.parseInt(args[0]);
		double c = 1;
		double n = 1 ;
		double myPie = 0; 
		for (int i = 0 ; i < counter ; i++){
			myPie = myPie + c/n;
			n=n+2;
			c=c*-1;
		}
		System.out.println("pi according to Java: " + pie);
		System.out.println("pi, approximated:	" + myPie * 4);
	}
}
