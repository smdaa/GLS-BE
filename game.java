import java.util.*;

public class game {
	
	private String explorateur;
	private int nbMaxObjet;
	private int nbConnaissance;
	private int nbObjet;
	private territoire lieuActuel;
	private enum territoire {DEBUT, SUCCES, ECHEC};
	private HashMap <String, Integer> inventaireObjet; //nom de l'objet et sa quantité
	private HashMap <String, Integer> inventaireConnaissance; //nom de la connaiissance et sa quantité
	private HashMap <String, Boolean> cheminsDispo;
	private HashMap <String, territoire> personnesDispo;
	private HashMap <territoire, HashMap<String, Integer>> objetsDispo; //Map de Map contenant les ojets et leurs quantités pour chaque lieu
	private HashMap <territoire, HashMap<String, Integer>> connaissancesDispo; 
	
	public game () {
		this.explorateur = "Le boss";
		this.nbMaxObjet = 5;
		this.lieuActuel = territoire.DEBUT;
		
		this.inventaireObjet= new HashMap <String, Integer>();
		this.inventaireObjet.put("Tentative",3);
		this.nbObjet += 3;
		
		this.inventaireConnaissance = new HashMap <String, Integer>();
		this.inventaireConnaissance.put("Réussite",0);
		
		this.cheminsDispo= new HashMap <String, Boolean>();
		this.cheminsDispo.put("DEBUT",true);
		this.cheminsDispo.put("SUCCES",false);
		this.cheminsDispo.put("ECHEC",false);
		
		this.personnesDispo = new HashMap <String, territoire>();
		this.personnesDispo.put("Sphinx", territoire.DEBUT);
		
		this.objetsDispo = new HashMap <territoire, HashMap<String, Integer>> ();
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		a.put("Tentative", 5);
		this.objetsDispo.put(territoire.DEBUT, a);
		
		this.connaissancesDispo = new HashMap <territoire, HashMap<String, Integer>> ();
		HashMap<String, Integer> b = new HashMap<String, Integer>();
		b.put("Réussite", 10);
		this.connaissancesDispo.put(territoire.DEBUT, b);
	}
	
	
	public static void main(String[] args) {

		game enigme = new game();
		Scanner scanner = new Scanner(System.in);

		int choix = 1;
		while (choix!=0) {
			System.out.println("\n*** Menu principale ***");
			System.out.println("1 - Afficher lieu actuel"); 
			System.out.println("2 - Consulter l'inventaire");
			System.out.println("3 - Interagir avec les personnes présentes");
			System.out.println("4 - Choisir un chemin");
			System.out.println("5 - Voir les objets/connaissances du lieu");
			System.out.println("6 - Déposer un objet");
			System.out.println("0 - Quitter");
			System.out.println("VEUILLEZ ENTRER UN ENTIER");
			choix = scanner.nextInt();
		
			switch(choix) {
			case 1: System.out.println("lieu actuel : " + enigme.lieuActuel);
				 	break;
			case 2: System.out.println("\n*** Liste des objets ***");
					for(Map.Entry m : enigme.inventaireObjet.entrySet()) {
						System.out.println("-" + m.getKey() + ":" + m.getValue());
					}		
					System.out.println("Stockage Total : " + enigme.nbMaxObjet);
					System.out.println("Stockage libre : " + (enigme.nbMaxObjet-enigme.nbObjet));
					System.out.println("\n*** Liste des connaissances ***");
					for(Map.Entry m : enigme.inventaireConnaissance.entrySet()) {
						System.out.println("-" + m.getKey() + ":" + m.getValue());
					}
					break;
			case 3: 
					int reponse = -1;
					if(enigme.personnesDispo.get("Sphinx")==enigme.lieuActuel && enigme.inventaireObjet.get("Tentative")!=0) {
					while (reponse!=3 && reponse!=0 && enigme.inventaireObjet.get("Tentative")!=0) {
						System.out.println("\nSphinx : Trois poissons sont dans un seau, l'un d'entre eux meurt, combien en reste t'il? ");
						System.out.println("*** Réponses ***");
						System.out.println("1 - Un");
						System.out.println("2 - Deux");
						System.out.println("3 - Trois");
						System.out.println("0 - Quitter");
						System.out.println("VEUILLEZ ENTRER UN ENTIER !");
						reponse = scanner.nextInt();
						enigme.inventaireObjet.replace("Tentative",enigme.inventaireObjet.get("Tentative")-1);
						
						if (reponse == 0){
							System.out.println("Ciao Ciao !");
						}else if (reponse!=3 && enigme.inventaireObjet.get("Tentative")!=0){
							System.out.println("OUuuuups, Réeesayez !");
							System.out.println("Il vouq reste Tentative : " + enigme.inventaireObjet.get("Tentative"));
						}else if (enigme.inventaireObjet.get("Tentative")==0) {
							System.out.println("Tu ne peux plus jouer : nb Tentative = 0");
							enigme.cheminsDispo.replace("ECHEC",true);
						}else{
							System.out.println("Bravo t'es un bg");
							enigme.inventaireConnaissance.replace("Réussite",enigme.inventaireConnaissance.get("Réussite")+1);
							enigme.cheminsDispo.replace("SUCCES",true);
						}
					}
					} else {
						System.out.println("Personne n'est là");
					}
					break;	
			case 4 : System.out.println("Liste des lieux accessibles");
					 /*int i = 1;
					 for(Map.Entry m : enigme.cheminsDispo.entrySet()) {
					 	if ((boolean) m.getValue() == true) {
						 System.out.println(i + " - " + m.getKey());
					 	}		
					 	i +=1;
					 }*/
					 if (enigme.cheminsDispo.get("DEBUT")==true) {
						 System.out.println("1 - DEBUT : DISPO");
					 }else {
						 System.out.println("1 - DEBUT : INDISPO");
					 }
					 if (enigme.cheminsDispo.get("SUCCES")==true) {
						 System.out.println("2 - SUCCES : DISPO");
					 }else {
						 System.out.println("2 - SUCCES : INDISPO");
					 }
					 if (enigme.cheminsDispo.get("ECHEC")==true) {
						 System.out.println("3 - ECHEC: DISPO");
					 }else {
						 System.out.println("3 - ECHEC : INDISPO");
					 }
					 boolean choixValide = false;
					 while(!choixValide) {
						 System.out.println("ENTREZ UN CHOIX VALIDE");
						 choix = scanner.nextInt();
						 switch (choix) {
						 case 1: if(enigme.cheminsDispo.get("DEBUT")==true) {
							 	 enigme.lieuActuel = territoire.DEBUT;
							 	 choixValide = true;
							 	 break;
						 }
						 case 2: if(enigme.cheminsDispo.get("SUCCES")==true) {
						 	 enigme.lieuActuel = territoire.SUCCES;
						 	 choixValide = true;
						 	 break;
					 	}
						case 3: if(enigme.cheminsDispo.get("ECHEC")==true) {
						 	 enigme.lieuActuel = territoire.ECHEC;
						 	 choixValide = true;
						 	 break;
					 	}
						 }
					 }
					 break;
			case 5: System.out.println("\n*** Objets présents ***");
					HashMap<String, Integer> objetsDuLieu = enigme.objetsDispo.get(territoire.DEBUT);
					for(Map.Entry m : objetsDuLieu.entrySet()) {
						System.out.println("-" + m.getKey() + ":" + m.getValue());
					}	
					System.out.println("\n*** Connaissances présentes ***");
					HashMap<String, Integer> connaissancesDuLieu = enigme.connaissancesDispo.get(territoire.DEBUT);
					for(Map.Entry m : connaissancesDuLieu.entrySet()) {
						System.out.println("-" + m.getKey() + ":" + m.getValue());
					}
					break;
			case 6: System.out.println("\n*** Liste des objets ***");
					for(Map.Entry m : enigme.inventaireObjet.entrySet()) {
						System.out.println("-" + m.getKey());
					}	
					System.out.println("Entrer l'objet à déposer. Respecter la casse et l'othographe");
					String objet1 = scanner.nextLine();// Sert à enlever la ligne vide
					String objet = scanner.nextLine();

					System.out.println("Quelle quantité à déposer?");
					int quantite = scanner.nextInt();
					enigme.deposer(enigme.lieuActuel,objet,quantite);
					break;
					
			case 7: System.out.println("\n*** Liste des objets sur ce lieu ***");
					HashMap<String, Integer> a = enigme.objetsDispo.get(enigme.lieuActuel);
					for(Map.Entry m : a.entrySet()) {
						System.out.println("-" + m.getKey() + " : " + m.getValue());
					}	
					System.out.println("Entrer l'objet à prendre. Respecter la casse et l'othographe");
					String objet2 = scanner.nextLine();// Sert à enlever la ligne vide
					String objetAPrendre = scanner.nextLine();
		
					System.out.println("Quelle quantité à prendre?");
					int quantiteAPrendre = scanner.nextInt();
					enigme.prendre(enigme.lieuActuel,objetAPrendre,quantiteAPrendre);
					break;
			}
		}	
}
	
	
public void deposer(territoire lieuCourant, String objet, Integer quantite) {
	if (this.inventaireObjet.containsKey(objet)) {
		if (this.objetsDispo.get(lieuCourant).containsKey(objet)) {
			HashMap<String, Integer> a = this.objetsDispo.get(lieuCourant);
			a.replace(objet, a.get(objet) + quantite);
			this.inventaireObjet.replace(objet, this.inventaireObjet.get(objet) - quantite);
			this.nbObjet -= quantite;	
		}else {
			HashMap<String, Integer> a = new HashMap<String, Integer>();
			a.put(objet, quantite);
			this.objetsDispo.put(lieuCourant, a);
			this.inventaireObjet.replace(objet, this.inventaireObjet.get(objet) - quantite);
			this.nbObjet -= quantite;	
		}
	}else {
		System.out.println("Vous n'avez pas : " + objet);
	}
}

public void prendre(territoire lieuCourant, String objet, Integer quantite) {
	if (this.objetsDispo.get(lieuCourant).containsKey(objet)) {
		if (this.inventaireObjet.containsKey(objet)) {
			HashMap<String, Integer> a = this.objetsDispo.get(lieuCourant);
			a.replace(objet, a.get(objet) - quantite);
			this.inventaireObjet.replace(objet, this.inventaireObjet.get(objet) + quantite);
			this.nbObjet += quantite;	
		}else {
			HashMap<String, Integer> a = this.objetsDispo.get(lieuCourant);
			a.replace(objet, a.get(objet) - quantite);
			this.objetsDispo.put(lieuCourant, a);
			this.inventaireObjet.put(objet, this.inventaireObjet.get(objet) + quantite);
			this.nbObjet += quantite;	
		}
	}else {
		System.out.println("Il n'y a pas de " + objet);
	}
}

	
	
}