package tp2package;

import java.util.Arrays;
import java.util.Scanner;

public class TriSimple {
	final static int MAX = 50; 
	
	private int[] tab ;
	int size; 
	int increment; 
	
	static TriSimple getTaille() {
		System.out.println("donner la taille de tab: "); 
		Scanner scan = new Scanner(System.in); 
		int si = scan.nextInt(); 
		if(si > 0) {
			return new TriSimple(si, 1); 
		} else {
			System.out.println("on va continuer avec la valeur choisi par le programmeur: " + MAX); 
			return new TriSimple(); 
		}
	}
	
	void insert(int number) {
		int[] newTab = new int[this.size + this.increment]; 
		int inserted = 0; 
		
		int i = 0; 
		for(i = this.size - 1; (i >= 0 && this.tab[i] > number); i--) {
			newTab[i+1] = this.tab[i]; 
		}
		newTab[i++] = number; 
		for(; i >=0; i--) {
			newTab[i] = this.tab[i]; 
		}
		this.tab = newTab; 
		this.size += 1; 
	}
	
	void supprimer(int number) {
		int index = Arrays.binarySearch(this.tab, number);
		int[] newTab = new int[this.size - this.increment]; 
		if(index != -1) {
			for(int i = index; i < this.size-1; i ++) {
				newTab[i] = this.tab[i+1]; 
			}
			for(int i = index-1; i>=0; i--) {
				newTab[i] = this.tab[i]; 
			}
			this.tab = newTab; 
		}
		else {
			System.out.println("Element not trouve");
		}
	}
	public TriSimple() {
		this.size = MAX; 
		this.tab = new int[MAX];
	}
	
	public TriSimple(int taille, int incre) {
		this.size = taille; 
		this.increment = incre; 
		this.tab = new int[this.size]; 
	}
	
	public String toString() {
		String s = ""; 
		
		for(int i: this.tab) {
			s+= Integer.toString(i) + " "; 
		}
		return s;
		
	}
	
	
}
