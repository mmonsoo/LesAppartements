package com.mmonsoor;

import java.util.ArrayList;
import java.util.List;

public class AppartementMultiCanapes {
	private int nombrePieces;
	private int superficie;
	private String couleurMurs;
	private String typeSol;
	private List<Canape> canapes;
	
	//Le constructeur
	public AppartementMultiCanapes(int tmpNombrePieces,int tmpSuperficie,String tmpCouleurMurs,String tmpTypeSol) {
		nombrePieces=tmpNombrePieces;
		superficie=tmpSuperficie;
		couleurMurs=tmpCouleurMurs;
		typeSol=tmpTypeSol;
		canapes=new ArrayList<Canape>();
	}
	
	public AppartementMultiCanapes(int tmpNombrePieces,int tmpSuperficie,String tmpCouleurMurs,String tmpTypeSol,List<Canape> tmpCanapes) {
		nombrePieces=tmpNombrePieces;
		superficie=tmpSuperficie;
		couleurMurs=tmpCouleurMurs;
		typeSol=tmpTypeSol;
		canapes=tmpCanapes;
	}
	
	public AppartementMultiCanapes() {
		nombrePieces=0;
		superficie=0;
		couleurMurs="";
		typeSol="";
		canapes=new ArrayList<Canape>();
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
	public void descriptionAppartement() {	
		if(canapes.size()!=0) {
			System.out.println("Bonjour je suis un appartement"+" d'une superficie de "+superficie+" m�tres carr�s."+"La couleur de mes murs est de "+couleurMurs+" et le type de mon sol est "+typeSol+". J'ai "+nombrePieces+" pi�ces."+"J'ai plusieurs canap�s qui vont se pr�senter ci-dessous :");
			for(Canape c:canapes) {
				System.out.println(c.descriptionCanape()+"\n");
			}
		}
		else {
			System.out.println("Bonjour je suis un appartement"+" d'une superficie de "+superficie+" m�tres carr�s."+"La couleur de mes murs est de "+couleurMurs+" et le type de mon sol est "+typeSol+". J'ai "+nombrePieces+" pi�ces."+"Je n'ai aucun canap�");
			
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
				System.out.println("Il n'y a plus de cloison � casser!");
			}
			else {
				System.out.println("On a cass� une cloison. Il reste un nombre de pi�ces de"+nombrePieces);
				nombrePieces--;		
			}					
		
	}
	
	public void ajouterCanape(Canape c) {
		canapes.add(c);
	}
	
	
	
	
	
}
