package dominio;
import dominio.Produto;


public class Ingrediente {
	private float quant;
	private Produto produto;
	
	public Ingrediente (float quant, Produto produto) {
		this.quant = quant;
		if (produto!=null) {
			this.produto=produto;
		}else {
			throw new RuntimeException("Erro: Produto não pode ser null.");
		}
	}
	
	public float getQuant() {
		return quant;
	}
	public Produto getProduto() {
		return produto;
	}
	public float calorias () {
		float calorias = quant * produto.calorias();
		return calorias;
	}

	
}
