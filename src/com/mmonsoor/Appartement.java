package com.mmonsoor;

public class Appartement implements Cloneable {
	private int nombrePieces;
	private int superficie;
	private String couleurMurs;
	private String typeSol;
	private Canape canapeSalon;
	
	//Le constructeur
	public Appartement(int tmpNombrePieces,int tmpSuperficie,String tmpCouleurMurs,String tmpTypeSol) {
		nombrePieces=tmpNombrePieces;
		superficie=tmpSuperficie;
		couleurMurs=tmpCouleurMurs;
		typeSol=tmpTypeSol;
		canapeSalon=null;
	}
	
	public Appartement(int tmpNombrePieces,int tmpSuperficie,String tmpCouleurMurs,String tmpTypeSol,Canape tmpCanape) {
		nombrePieces=tmpNombrePieces;
		superficie=tmpSuperficie;
		couleurMurs=tmpCouleurMurs;
		typeSol=tmpTypeSol;
		canapeSalon=tmpCanape;
	}
	
	public Appartement() {
		nombrePieces=0;
		superficie=0;
		couleurMurs="";
		typeSol="";
		canapeSalon=null;
	}
	
	public int getNombrePieces() {
		return nombrePieces;
	}



	public void setNombrePieces(int nombrePieces) {
		this.nombrePieces = nombrePieces;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public String getCouleurMurs() {
		return couleurMurs;
	}
	public void setCouleurMurs(String couleurMurs) {
		this.couleurMurs = couleurMurs;
	}
	public String getTypeSol() {
		return typeSol;
	}
	public void setTypeSol(String typeSol) {
		this.typeSol = typeSol;
	}
	public String descriptionAppartement() {
		if(canapeSalon!=null) {
		return("Bonjour je suis un appartement"+" d'une superficie de "+superficie+" mètres carrés."+"La couleur de mes murs est de "+couleurMurs+" et le type de mon sol est "+typeSol+". J'ai "+nombrePieces+" pièces."+"J'ai un canape qui va se présenter :"+canapeSalon.descriptionCanape());
		}
		else {
			return("Bonjour je suis un appartement"+" d'une superficie de "+superficie+" mètres carrés."+"La couleur de mes murs est de "+couleurMurs+" et le type de mon sol est "+typeSol+". J'ai "+nombrePieces+" pièces."+"Je n'ai aucun canapé");
			
		}
	}
	/**
	 * Modifier la couleur de l'appartement
	 * @param couleurMurs
	 */
	public void repeindre(String tmpCouleurMurs) {
		couleurMurs = tmpCouleurMurs;
	}
	
	public void casserUneCloison() {
			if(nombrePieces==0) {
				System.out.println("Il n'y a plus de cloison à casser!");
			}
			else {
				System.out.println("On a cassé une cloison. Il reste un nombre de pièces de"+nombrePieces);
				nombrePieces--;		
			}					
		
	}
	
	public void ajouterCanape(Canape c) {
		canapeSalon=c;
	}
	
/**	
	//Création d'un constructeur de copie de surface
	public Appartement(Appartement a) {
		nombrePieces=a.nombrePieces;
		superficie=a.superficie;
		couleurMurs=a.couleurMurs;
		typeSol=a.typeSol;
		canapeSalon=a.canapeSalon;	
	}
	
**/	
	
	
	//Création d'un constructeur de copie profonde
		public Appartement(Appartement a) {
			nombrePieces=a.nombrePieces;
			superficie=a.superficie;
			couleurMurs=a.couleurMurs;
			typeSol=a.typeSol;
			Canape copie=new Canape(a.canapeSalon.getNombrePlaces(), a.canapeSalon.getMotif(),a.canapeSalon.getCouleur());
			canapeSalon=copie;
		}

	
	
/**		
	//Création d'un constructeur de copie avec Clonable , méthode copie de surface
	public Appartement clone() throws CloneNotSupportedException{
		// C'est la méthode clone de la classe Object
		return (Appartement) super.clone();
	}
**/	
		
		//Création d'un constructeur de copie avec Clonable , méthode copie profonde
		public Appartement clone() throws CloneNotSupportedException{
			// C'est la méthode clone de la classe Object
			Appartement a2=(Appartement) super.clone();
			a2.ajouterCanape(new Canape(canapeSalon.getNombrePlaces(),canapeSalon.getMotif(),canapeSalon.getCouleur()));
			return a2;
		}
	
}
