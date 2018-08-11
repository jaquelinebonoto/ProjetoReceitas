package dominio;

public class Assado extends Pastel {
	
	public Assado (String nome) {
		super(nome);
	}
	
	public float caloriaAdicional() {
		float calAssado = (float) (totalCalorias() * 0.95);
		return calAssado;
	}
}
