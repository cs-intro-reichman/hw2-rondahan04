// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		char mode  = args[1].charAt(0);
		boolean a = true;
		boolean b = true;
		int num1 = 1;
		int num2 = 1;
		int counterInside = 1;
		int counterOutside = 0;
		System.out.print(num1 + " ");
		if (mode == 'v'){
		while (a){
			counterInside = 1;
			while (b) { // doing the inside loop
				if (num1 % 2 == 0){ // number is even
					num1=num1/2;
					System.out.print(num1 + " ");
				}
				else { // number is odd
					num1=num1*3+1;
					System.out.print(num1 + " ");
				}
				counterInside++;
				if (num1 == 1){ // finished inside loop
					System.out.print("(" + counterInside + ")");
					System.out.println();
					b = false; // restart 29-32
					num2++; 
					num1=num2;
					counterOutside++;
					if ( counterOutside != seed){
						System.out.print(num1 + " ");
					}
				}
			}
			b = true;
			if (counterOutside == seed){
				a = false;
			}
		}
		System.out.println("Every one of the first " + counterOutside+" hailstone sequences reached 1.");
		}
		else {
			System.out.println("Every one of the first " + seed +" hailstone sequences reached 1.");
		}
	}

	}
