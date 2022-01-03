
public class Livre {
	private String titre; 
	private String[] auteurs; 
	private String ISBN; 
	private double prix; 
	
	Livre(
			String titre, 
			String[] auts, 
			String ISBN, 
			double prix
			){
		this.titre = titre; 
		this.ISBN = ISBN; 
		this.prix = prix; 		
		this.auteurs = auts;
	}
	
	public boolean livreContainsAuth(String auth) {
		for(String s: this.auteurs) {
			if(s.startsWith(auth)) {
				return true; 
			}
		}
		return false; 
	}
	
	public String toString() {
		String s = "Livre ( livre = " + titre + 
				" | ISBN = " + ISBN +
				" | Auteurs = [";
				
		for(String a: this.auteurs) {
			s += a + ", "; 
		}
		
		s += "]" + " | Prix: " + prix + " )"; 
		
		return s; 	
	}
	
};
