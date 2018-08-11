package dominio;

public class Frito extends Pastel {

	public Frito (String nome) {
		super(nome);
	}
	
	public float caloriaAdicional() {
		float calFrito = totalCalorias() + 100;
		return calFrito;
	}
}
