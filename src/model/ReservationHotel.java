package model;

public class ReservationHotel extends Reservation {
	private int jour;
	private int mois;
	private int nb_lits_simples;
	private int nb_lits_doubles;
	private int num_chambre;
	
	public ReservationHotel(int jour, int mois, int nombre_lits_simples, int nombre_lits_doubles, int numero_chambre) {
		this.jour = jour;
		this.mois = mois;
		nb_lits_simples = nombre_lits_simples;
		nb_lits_doubles = nombre_lits_doubles;
		num_chambre = numero_chambre;
	}
	
	public String toString() {
		return "Le " + jour + "/" + mois + "\n" + "Chambre " + num_chambre + " avec " + nb_lits_simples + " lits simples et " + nb_lits_doubles + "lits doubles.";
	}
}
