package dominio;

import java.util.ArrayList;
import java.util.List;

public class Combo {
	private String nome;
	private List<Pastel> pastel;
	
	public Combo (String nome) {
		this.nome = nome;
		this.pastel = new ArrayList<Pastel>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Pastel> pastel(){
		return pastel;
	}
	
	public void adicionaPastel (Pastel pa) {
		this.pastel.add(pa);
	}
}
