package com.mmonsoor;

public class Canape {
	//Les attributs de la classe
	private int nombrePlaces;
	private String motif;
	private String couleur;
	//Le constructeur
	public Canape(int tmpNombrePlaces,String tmpMotif,String tmpCouleur) {
		nombrePlaces=tmpNombrePlaces;
		motif=tmpMotif;
		couleur=tmpCouleur;	
	}
	
	public String descriptionCanape() {
		return ("Je suis un canapé qui a "+nombrePlaces+ " places."+"J'ai un motif de type "+motif+" et j'ai la couleur "+couleur+".");
	}

	public int getNombrePlaces() {
		return nombrePlaces;
	}

	public void setNombrePlaces(int nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	




}
