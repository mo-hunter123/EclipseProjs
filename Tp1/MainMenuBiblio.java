import java.awt.print.Printable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;


public class MainMenuBiblio {
	public static void print(String arg) {
		System.out.println(arg); 
		ArrayList<Integer> Liste = new ArrayList<Integer>(); 
		
		
	}
	
	public static Livre insertLivre(Scanner scan) {
		
		String[] data = new String[3]; 
		scan.nextLine(); 
		int nbAuteurs = 0; 
		print("Titre: "); 
		data[0] = scan.nextLine(); 
		print("ISBN: ");
		data[1] = scan.nextLine(); 
		print("prix: "); 
		data[2] = scan.nextLine(); 
		
		print("Nombre d'auteurs: "); 
		nbAuteurs = scan.nextInt(); 
		
		scan.nextLine(); 
		String[] auteurs = new String[nbAuteurs];  
		for(int i = 0; i<nbAuteurs; i++) {
			print("Auteur: "); 
			auteurs[i] = scan.nextLine();
		}
		
		return new Livre(data[0], auteurs, data[1], Double.parseDouble(data[2]));
		
	}
	
	public static void main(String[] args) {
		
		Vector<Livre> L = new Vector<Livre>(); 
		
		int choice = 0; 
		int capacite = 0; 
		
		
		Scanner scan = new Scanner(System.in); 
		
		print("Avant de continuer veuillez creer une bibliotheque"); 
		print("Donner la capacite: "); 
		capacite = scan.nextInt(); 
		
		Bibliotheque bib = new Bibliotheque(capacite); 
		
		print("=====> Bienvenue a la Biblio <=====");
		
		do {
			print("1- Afficher les livres de la biblio");
			print("2- Inserer un livre");
			print("3- Chercher par auteur");
			print("4- quitter");
			
			do {
				print("Choix: "); 
				choice = scan.nextInt();	
			}while(choice < 1 || choice >4); 
	
			switch (choice) {
				case 1:
					System.out.println(bib); 
					
					break;
					
				case 2:
					Livre l = insertLivre(scan);
					if(!bib.ajoutLivre(l))
						print("Pas d'espace dans la bibliotheque pour ajouter d'autre livre");
					break;
					
				case 3:
					scan.nextLine(); 
					print("Inserer le nom ou le debut du nom d'auteur: "); 
					String aut = scan.nextLine(); 
					L = bib.cherche(aut); 
					for(Livre ll: L) {
						System.out.println(ll);
					}
					break; 
					
				case 4: 
					print("Merci pour votre temps");
					System.exit(0);
					break;
		
				default:
					break;
			}
			
			try {
				char ch = (char) System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}while(choice  != 4); 
	}
}
