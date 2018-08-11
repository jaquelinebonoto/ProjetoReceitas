package dominio;

public class Produto {
	private String nome;
	private float carboidrato;
	private float proteina;
	private float gordura;
	
	public Produto (String nome, float carboidrato, float proteina, float gordura) {
		this.nome=nome;
		this.carboidrato = carboidrato;
		this.proteina = proteina;
		this.gordura = gordura;
	}
	
	public String getNome() {
		return nome;
	}
	public float getCarboidrato () {
		return carboidrato;
	}
	public float getProteina () {
		return proteina;
	}
	public float getGordura () {
		return gordura;
	}
	public float calorias () {
		float calorias = 4*carboidrato + 5*proteina + 6*gordura;
		return calorias;
	}
}
