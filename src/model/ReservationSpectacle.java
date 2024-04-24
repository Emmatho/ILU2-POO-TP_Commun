package model;

public class ReservationSpectacle extends Reservation {
	private int jour;
	private int mois;
	private int num_zone;
	private int num_chaise;
	
	public ReservationSpectacle(int jour, int mois, int num_zone, int num_chaise) {
		this.jour = jour;
		this.mois = mois;
		this.num_zone = num_zone;
		this.num_chaise = num_chaise;
	}
	
	public String toString() {
		return "Le " + jour + "/" + mois + "\n" + "Spectacle zone " + num_zone + " à la chaise n°" + num_chaise + ".";
	}
}
