package model;

public class EntiteReservable {
	private CalendrierAnnuel carnet_reservation = new CalendrierAnnuel();
	private int identification;
	
	public EntiteReservable() {
		;
	}
	
	public void setId(int id) {
		identification = id;
	}
	
	public int getId() {
		return identification;
	}
	
}
