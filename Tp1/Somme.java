
public class Somme {
	public static int calculate(String[] nums) {
		int Sum = 0; 
		
		int ind = 0; 
		for(String s: nums) {
			try {
				ind = Integer.parseInt(s); 
			}catch(NumberFormatException e) {
				System.out.println(e);
				ind = 0;
			}
			
			Sum += ind; 
		}
		return Sum; 
	}
	
	public static void main(String[] args) {
		int Sum = Somme.calculate(args); 
		System.out.println(Sum); 
	}
}
