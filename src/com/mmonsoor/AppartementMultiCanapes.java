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
			System.out.println("Bonjour je suis un appartement"+" d'une superficie de "+superficie+" mètres carrés."+"La couleur de mes murs est de "+couleurMurs+" et le type de mon sol est "+typeSol+". J'ai "+nombrePieces+" pièces."+"J'ai plusieurs canapés qui vont se présenter ci-dessous :");
			for(Canape c:canapes) {
				System.out.println(c.descriptionCanape()+"\n");
			}
		}
		else {
			System.out.println("Bonjour je suis un appartement"+" d'une superficie de "+superficie+" mètres carrés."+"La couleur de mes murs est de "+couleurMurs+" et le type de mon sol est "+typeSol+". J'ai "+nombrePieces+" pièces."+"Je n'ai aucun canapé");
			
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
		canapes.add(c);
	}
	
	
	
	
	
}
