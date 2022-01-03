package tp2package;

import java.util.StringTokenizer;

public class Exo1 {
	public static String tronque(Double x, int nbDecimals) {
		String str = new String(x.toString());
		String res = ""; 
		int i = 0;
		
		StringTokenizer st = new StringTokenizer(str, "."); 
		res+= st.nextToken();
		int j = 0;
		char[] c = str.toCharArray(); 
		
		for(i =0; i<str.length(); i++) {
			if(c[i] == '.') {
				break; 
			} 
		}
		j=i; 
		i = 0; 
		while(i <= nbDecimals) {
			if(j+i < str.length()){
				res+=c[j+i]; 
			} else {
				res += '0'; 
			}
			
			i++;
		}
		
		return res; 
	}
	
	
	
	public static void main(String[] args) {
		int i = 0; 
		int Decis = 0; 
		double x = 0.0; 
		int exep = 0; 
		if(args.length%2 == 0 && args.length > 1) {
			while(i < args.length) {
				exep = 0; 
				try {
					Decis = Integer.parseInt(args[i+1]);
					x = Double.parseDouble(args[i]); 
				} catch (Exception e) {
					System.out.println(e + " alors les arguments seont annuler");
					exep = 1; 
				}
				if(exep == 0)
					System.out.println(tronque(x, Decis));
				i+=2; 
			}
		}
		
		else {
			System.out.println("vous avez un prblm avec les arguments ");
		}
	}
}
