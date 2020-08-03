package examples;

public class CheckPromise {
	
	public static void main(String [] args) {

	
		int number = 98;
		

		
		if (isPromise(number)) {
			
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
		
		
	    
	}
	
	public static boolean isPromise(int x) {
		
		boolean check = (x == 1 || x == 0) ? false: true;
		
		
		
		if (x > 1) {
			
			for (int i = 2; i < x; i++) {
				
				if ((x % i == 0) && (i != x)) {
					System.out.println("Prime check found that " + x + " is divisible at " + i);
					
					check = false;
				}
				

				
			}
		}
		
		return check;
	}
	
	
}
