package model;

public class FormulaireSpectacle {
	private int jour;
	private int mois;
	private int num_place;
	private int num_zone;
	
	public FormulaireSpectacle(int jour, int mois, int num_zone) {
		this.jour = jour;
		this.mois = mois;
		this.num_zone = num_zone;
	}
	
	public void setIdentificationEntite(int id) {
		num_place = id;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public int getNumZone() {
		return num_zone;
	}
	
	public int getIdentificationEntite() {
		return num_place;
	}
}
