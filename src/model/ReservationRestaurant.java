package model;

public class ReservationRestaurant extends Reservation {
	private int numero_service;
	private int numero_table;
	
	public ReservationRestaurant(int jour, int mois, int numero_service, int numero_table) {
		super(jour, mois);
		this.numero_service = numero_service;
		this.numero_table = numero_table;
	}
	
	public String toString() {
		String ieme_service = "premier";
		if (numero_service == 2) {
			ieme_service = "deuxième";
		}
		return super.toString() + "Table " + numero_table + " pour le " + ieme_service + " service.";
	}
}
