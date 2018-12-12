
public abstract class Prodotti {

	private float prezzoUnitario;
	private String descrizione;
	private ID id;
	
	public Prodotti(IDTYPE type, String descrizione, float prezzoUnitario) {
		this.id = new ID(type);
		this.descrizione = descrizione;
		this.prezzoUnitario = prezzoUnitario;
	}

	public float getPrezzoUnitario() {
		return prezzoUnitario;
	}

	public String getDescrizione() {
		return descrizione;
	}
	
	public abstract void applicaSconto();
}
