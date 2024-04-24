package model;

public class FormulaireRestaurant {
	private int jour;
	private int mois;
	private int num_table;
	private int nb_personnes;
	private int num_service;
	
	public FormulaireRestaurant(int jour, int mois, int nb_personnes, int num_service) {
		this.jour = jour;
		this.mois = mois;
		this.nb_personnes = nb_personnes;
		this.num_service = num_service;
	}
	
	public void setIdentificationEntite(int id) {
		num_table = id;
	}
	
	public int getNombrePersonnes() {
		return nb_personnes;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public int getNumService() {
		return num_service;
	}
	
	public int getIdentificationEntite() {
		return num_table;
	}
}
