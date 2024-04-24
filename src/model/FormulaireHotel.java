package model;

public class FormulaireHotel {
	private int jour;
	private int mois;
	private int num_chambre;
	private int nb_lits_simples;
	private int nb_lits_doubles;
	
	public FormulaireHotel(int jour, int mois, int nb_lits_simples, int nb_lits_doubles) {
		this.jour = jour;
		this.mois = mois;
		this.nb_lits_simples = nb_lits_simples;
		this.nb_lits_doubles = nb_lits_doubles;
	}
	
	public void setIdentificationEntite(int id) {
		num_chambre = id;
	}
	
	public int getNombreLitsSimples() {
		return nb_lits_simples;
	}
	
	public int getJour() {
		return jour;
	}
	
	public int getMois() {
		return mois;
	}
	
	public int getNombreLitsDoubles() {
		return nb_lits_doubles;
	}
	
	public int getIdentificationEntite() {
		return num_chambre;
	}
}
