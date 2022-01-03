package tp2package;

import java.io.IOException;
import java.util.Scanner;

public class EssaiTri {
	public static TriSimple getData(int cap) {
		TriSimple ob = new TriSimple();
		Scanner sca = new Scanner(System.in); 
		int val = 0; 
		for(int i = 0; i<cap; i++) {
			val = sca.nextInt(); 
			
		}
		return null;
		
	}
	public static void main(String[] args) {

		char choice = 0; 
		TriSimple obj1 = new TriSimple(); 
		Scanner sca = new Scanner(System.in);
		int cap = 0; 
		try {
			choice = (char) System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		do {
			System.out.println("a- inserer des donnees");
			System.out.println("s- supprimer de donnees");
			System.out.println("q- quitter");
		}while(choice != 'a' || choice!='s' || choice!='q');
		
		switch(choice) {
		case 'a':
			cap = sca.nextInt(); 
//			obj1 = geData(cap); 
			
			break; 
		}
		
	}
}
