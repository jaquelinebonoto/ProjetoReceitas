package teste;
import dominio.Assado;
import dominio.Combo;
import dominio.Frito;
import dominio.Ingrediente;
import dominio.Pastel;
import dominio.Produto;
import tela.Tela;

import java.util.ArrayList;
import java.util.List;


public class Testes {
	
	
	public static void main(String[] args) {
	
		//Exercício 2
		//public Produto (String nome, float carboidrato, float proteina, float gordura) 
		Produto p1, p2, p3, p4;
		p1 = new Produto ("Farinha", 0.1f, 0.2f, 0.3f);
		p2 = new Produto ("Leite", 0.2f, 0.3f, 0.4f);
		p3 = new Produto ("Mateiga", 0.4f, 0.3f, 0.2f);
		p4 = new Produto ("Açúcar", 0.3f, 0.2f, 0.1f);
		
	    List<Produto> produto = new ArrayList<Produto>();
	    produto.add(p1);
	    produto.add(p2);
	    produto.add(p3);
	    produto.add(p4);

	    //Exercício 3
	    //criando produtos
	    Pastel pa1, pa2, pa3, pa4;
	    pa1 = new Assado ("Pastel Alemão Assado");
	    pa2 = new Assado ("Pastel Italiano Assado");
	    pa3 = new Frito ("Pastel Alemão Frito");
	    pa4 = new Frito ("Pastel Italiano Frito");
	    
		//public Ingrediente (float quant, Produto produto)
	    //relacionando ingrediente e produto
	    Ingrediente i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16;
	    i1 = new Ingrediente (90.f, p1);
	    i2 = new Ingrediente (80.f, p2);
	    i3 = new Ingrediente (70.f, p3);
	    i4 = new Ingrediente (60.f, p4);
	    
	    i5 = new Ingrediente (80.f, p1);
	    i6 = new Ingrediente (70.f, p2);
	    i7 = new Ingrediente (60.f, p3);
	    i8 = new Ingrediente (50.f, p4);
	    
	    i9 = new Ingrediente (70.f, p1);
	    i10 = new Ingrediente (60.f, p2);
	    i11 = new Ingrediente (70.f, p3);
	    i12 = new Ingrediente (60.f, p4);
	    
	    i13 = new Ingrediente (60.f, p1);
	    i14 = new Ingrediente (50.f, p2);
	    i15 = new Ingrediente (80.f, p3);
	    i16 = new Ingrediente (70.f, p4);
	    
	    //adicionando ingredientes aos pastéis	    
	    pa1.adicionaIngrediente(i1);
	    pa1.adicionaIngrediente(i2);
	    pa1.adicionaIngrediente(i3);
	    pa1.adicionaIngrediente(i4);
	    
	    pa2.adicionaIngrediente(i5);
	    pa2.adicionaIngrediente(i6);
	    pa2.adicionaIngrediente(i7);
	    pa2.adicionaIngrediente(i8);
	    
	    pa3.adicionaIngrediente(i9);
	    pa3.adicionaIngrediente(i10);
	    pa3.adicionaIngrediente(i11);
	    pa3.adicionaIngrediente(i12);
	    
	    pa4.adicionaIngrediente(i13);
	    pa4.adicionaIngrediente(i14);
	    pa4.adicionaIngrediente(i15);
	    pa4.adicionaIngrediente(i16);
	    
	    //Lista de receitas de pastel
	    List<Pastel> pastel = new ArrayList<Pastel>();
	    pastel.add(pa1);
	    pastel.add(pa2);
	    pastel.add(pa3);
	    pastel.add(pa4);

	    //Exercício 4
	    
		//public Combo (String nome)
	    //instanciando combos
	    Combo c1, c2;
	    c1 = new Combo ("Combo A");
	    c2 = new Combo ("Combo B");
	    
	    //adicionando pastéis aos combos
	    c1.adicionaPastel(pa1);
	    c1.adicionaPastel(pa3);
	    
	    c2.adicionaPastel(pa3);
	    c2.adicionaPastel(pa2);
	    c2.adicionaPastel(pa4);
	    
	    //Lista de combos
	    List<Combo> combo = new ArrayList<Combo>();
	    combo.add(c1);
	    combo.add(c2);
	    
	    //Exercício 5
	    System.out.println("----------- Exerc. 5 -----------");
	    System.out.println("Nome           Carboidratos            Proteinas              Gorduras           Calorias");
	    for (Produto p: produto) {
	      System.out.println(p.getNome() + "             " + p.getCarboidrato() + "                   " + p.getProteina() + "                   " + p.getGordura() + "                  " + p.calorias() + "  ");
	    }
	    System.out.println();
	    

	    //Exercício 6
	      System.out.println("----------- Exerc. 6 -----------");
		  System.out.println("Nome: " + pa1.getNome());	      
		  System.out.println("Ingrediente           Carboidratos            Proteinas              Gorduras           Calorias");
	      for (Ingrediente i: pa1.ingrediente()) {
	    	System.out.println(i.getQuant() + "g de " + i.getProduto().getNome() + "           " + i.getQuant()*i.getProduto().getCarboidrato() + "                   " + i.getQuant()*i.getProduto().getProteina() + "                 " + i.getQuant()*i.getProduto().getGordura() +  "               "   + i.getQuant()*i.getProduto().calorias() + "   ");
	      }
		  System.out.println("Total de gorduras ===================================================== " + pa1.totalGorduras() );
		  System.out.println("Sub-Total da Calorias====================================================================== " + pa1.totalCalorias() );	
		  System.out.println("Assado (desconto 5%)=================================================================== " + (pa1.caloriaAdicional()-pa1.totalCalorias()));
		  System.out.println("Total de calorias======================================================================== " + pa1.caloriaAdicional());
		    System.out.println();

		//Exercício 7
		  float prot=0;
		System.out.println("----------- Exerc. 7 -----------");
		System.out.println("Nome: " + c2.getNome());	      
		for (Pastel pa: c2.pastel()) {
				System.out.print("1 " + pa.getNome() + " =  " + pa.totalCalorias() + " calorias, ");
					for (Ingrediente i: pa.ingrediente()) {
						prot = i.getQuant()*i.getProduto().getProteina() + prot;
					}
					 System.out.println(" " + prot + "g de proteínas");		
			}
	    System.out.println();
  
		Tela tela = new Tela();

	    System.out.println("---------- Tela - imprimePastel ------------");
	    tela.imprimePastel(pastel);
	    System.out.println();

	    System.out.println("---------- Tela - imprimeCombo ---------------");
	    tela.imprimeCombo(combo);
	    System.out.println();

	}
	
	
	
}
