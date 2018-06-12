package com.mmonsoor;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appartement appart1=new Appartement(2,60,"Blanc","Plancher en bois");
		System.out.println(appart1.descriptionAppartement());
		//Création d'un canapé
		Canape canap1=new Canape(10,"Irlandais","Rouge");
		
		
		System.out.println(canap1.descriptionCanape());
		appart1.repeindre("Jaune Fuschia");
		System.out.println(appart1.descriptionAppartement());
		appart1.casserUneCloison();
		System.out.println(appart1.descriptionAppartement());
		appart1.casserUneCloison();
		System.out.println(appart1.descriptionAppartement());
		appart1.casserUneCloison();
		//On ajoute un canapé au salon
		appart1.ajouterCanape(canap1);
		Canape canap2=new Canape(15,"Versaillais","Bleu");
		System.out.println(appart1.descriptionAppartement());
		//On crée un appartement avec un canapé
		Appartement appartementAvecCanape=new Appartement(3,90,"Noir","Carelage",canap2);
		System.out.println(appartementAvecCanape.descriptionAppartement());
		//Canapé en projet
		Appartement appartementEnProjet=new Appartement();
		System.out.println(appartementEnProjet.descriptionAppartement());
		Canape canap3=new Canape(10,"Gothique","Jaune");
		AppartementMultiCanapes appartementmulticanapes=new AppartementMultiCanapes(3, 80, "Rose BonBon", "Parquet");
		appartementmulticanapes.ajouterCanape(canap1);
		appartementmulticanapes.ajouterCanape(canap2);
		appartementmulticanapes.ajouterCanape(canap3);
		appartementmulticanapes.descriptionAppartement();
		AppartementMultiCanapes appartementmulticanapes2=new AppartementMultiCanapes(3, 80, "Rose BonBon", "Parquet");
		appartementmulticanapes2.descriptionAppartement();
		//On va copier un appartement existant
		System.out.println("INFORMATIONS CANAPEORIGINEL");
		System.out.println(appart1.descriptionAppartement());
		//On va modifier le canapé de l'appartement1 originel
		appart1.ajouterCanape(canap3);
		System.out.println(appart1.descriptionAppartement());
		System.out.println("INFORMATIONS CANAPECOPIE");
		Appartement appartementCopie=new Appartement(appart1);
		System.out.println(appartementCopie.descriptionAppartement());
		appart1.ajouterCanape(canap2);
		System.out.println("Appartement originel remodifié");
		System.out.println(appart1.descriptionAppartement());
		System.out.println("INFORMATIONS CANAPECOPIE");
		System.out.println(appartementCopie.descriptionAppartement());
		//Utilisation de cloneable
		try {
			Appartement copieAppartement1Cloneable=appart1.clone();
			System.out.println("Appartement cloneable");
			System.out.println(copieAppartement1Cloneable.descriptionAppartement());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
