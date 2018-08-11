package dominio;
import java.util.ArrayList;
import java.util.List;

public abstract class Pastel {
	private String nome;
	private List<Ingrediente> ingrediente;
	
	public Pastel (String nome) {
		this.nome = nome;
		this.ingrediente = new ArrayList<Ingrediente>();
	}
	
	public String getNome() {
		return nome;
	}
	public List<Ingrediente> ingrediente(){
		return this.ingrediente;
	}
	
	public void adicionaIngrediente(Ingrediente i) {
		this.ingrediente.add(i);
	}
	
	public float totalGorduras() {
		float totalGorduras = 0;
		for (Ingrediente i: ingrediente()) {
			totalGorduras += i.getQuant()*i.getProduto().getGordura();
		}
		return totalGorduras;
	}
	
	public float totalCalorias() {
		float totalCalorias = 0;
		for (Ingrediente i: ingrediente()) {
			totalCalorias += i.calorias();
		}
		//totalCalorias=totalCalorias + caloriaAdicional();
		return totalCalorias;
	}
	public abstract float caloriaAdicional();
}
