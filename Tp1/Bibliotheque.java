import java.util.ArrayList;
import java.util.Vector;

public class Bibliotheque {

	private ArrayList<Livre> ListeLivres; 
	private int capacite; 
	private int size; 
	
	Bibliotheque(int nbMax){
		if(nbMax>0)
			this.capacite = nbMax;
		else 
			nbMax = 0; 
		this.ListeLivres = new ArrayList<Livre>();
		this.size = 0; 
	}
	
	
	public int getCapacite() {
		return this.capacite ;
	}
	
	
	public boolean ajoutLivre(Livre li) {
		if(this.size < this.capacite ) {
			this.ListeLivres.add(li);
			this.size ++; 
			return true; 
		}
		
		return false; 
	}
	
	public int getSize() {
		return this.size; 
	}
	
	public String toString() {
		String s = ""; 
		for(Livre l: this.ListeLivres ) {
			s += "{" + l.toString() + ", ";
		}
		
		s+= " }"; 
		return s; 
	}
	
	public Vector<Livre> cherche(String auth){
		Vector<Livre> liste = new Vector<Livre>(); 
		for(Livre l: this.ListeLivres) {
			if(l.livreContainsAuth(auth)) {
				liste.add(l); 
			}
		}
		return liste; 
	}
	
}
