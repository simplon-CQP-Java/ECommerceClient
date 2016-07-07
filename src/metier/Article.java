package metier;

import java.io.Serializable;

public class Article implements Serializable {
	
	public Article(){}
	
	public Article(int code, String designation, double prix, double remise, int quantité) {
		super();
		this.code = code;
		this.designation = designation;
		this.prix = prix;
		this.remise = remise;
		this.quantité = quantité;
	}
	
	public Article(int code, String designation, double prix) {
		super();
		this.code = code;
		this.designation = designation;
		this.prix = prix;
	}
	int code;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public double getRemise() {
		return remise;
	}
	public void setRemise(double remise) {
		this.remise = remise;
	}
	public int getQuantité() {
		return quantité;
	}
	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}
	
	private String designation;
	private double prix;
	private double remise;
	private int quantité;
	
	@Override
	public String toString() {
		return "Article [code=" + code + ", designation=" + designation + ", prix=" + prix + ", remise=" + remise
				+ ", quantité=" + quantité + "]";
	}
	
	
	
	
	
}
