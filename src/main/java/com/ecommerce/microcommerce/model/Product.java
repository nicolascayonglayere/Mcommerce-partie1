package com.ecommerce.microcommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;

@Entity
// @JsonFilter("monFiltreDynamique")
public class Product {

	@Id
	@GeneratedValue
	private int id;

	@Length(min = 3, max = 20, message = "Nom trop long ou trop court. Et oui messages sont plus stylés que ceux de Spring")
	private String nom;

	@Min(value = 0)
	private int prix;

	// information que nous ne souhaitons pas exposer
	private int prixAchat;

	// constructeur par défaut
	public Product() {
	}

	// constructeur pour nos tests
	public Product(int id, String nom, int prix, int prixAchat) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.prixAchat = prixAchat;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return this.prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getPrixAchat() {
		return this.prixAchat;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}

	@Override
	public String toString() {
		return "Product{" + "id=" + this.id + ", nom='" + this.nom + '\'' + ", prix=" + this.prix + '}';
	}
}
