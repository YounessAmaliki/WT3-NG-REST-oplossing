package edu.ap.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	
	private String name;
	private String regisseur;
	private String[] acteurs;

	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRegisseur() {
		return regisseur;
	}
	public void setRegisseur(String regisseur) {
		this.regisseur = regisseur;
	}
	public String[] getActeurs() {
		return acteurs;
	}
	public void setActeurs(String[] acteurs) {
		this.acteurs = acteurs;
	}
	
}
