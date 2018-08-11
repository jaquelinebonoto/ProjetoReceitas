package tela;
import dominio.Combo;
import dominio.Ingrediente;
import dominio.Pastel;
import java.util.List;





public class Tela {
	
    //Exercício 8

	
	public void imprimePastel(List<Pastel> pastel){
	    System.out.println("----------- Exerc. 8 -----------");
		for (Pastel pa: pastel) {
			System.out.println("Nome: " + pa.getNome());	      
			System.out.println("Ingrediente           Carboidratos            Proteinas              Gorduras           Calorias");
			for (Ingrediente i: pa.ingrediente()) {
				System.out.println(i.getQuant() + "g de " + i.getProduto().getNome() + "           " + i.getQuant()*i.getProduto().getCarboidrato() + "                   " + i.getQuant()*i.getProduto().getProteina() + "                 " + i.getQuant()*i.getProduto().getGordura() +  "               "   + i.getQuant()*i.getProduto().calorias() + "   ");
			}
			  System.out.println("Total de gorduras ===================================================== " + pa.totalGorduras() );
			  System.out.println("Sub-Total da Calorias====================================================================== " + pa.totalCalorias() );	
			  System.out.println("Assado (desconto 5%)=================================================================== " + (pa.caloriaAdicional()-pa.totalCalorias()));
			  System.out.println("Total de calorias======================================================================== " + pa.caloriaAdicional());
			    System.out.println();
		}
	    System.out.println();
	}
		
	//Exercício 9
		public void imprimeCombo(List<Combo> combo){
		    System.out.println("----------- Exerc. 9 -----------");
			for (Combo c: combo) {
			  float prot=0, prot2=0, prot3=0;
				System.out.println("Nome: " + c.getNome());	      
				for (Pastel pa: c.pastel()) {
						System.out.print("1 " + pa.getNome() + " =  " + pa.totalCalorias() + " calorias, ");
							for (Ingrediente i: pa.ingrediente()) {
								prot = i.getQuant()*i.getProduto().getProteina() + prot;
								prot2 = i.getQuant()*i.getProduto().getGordura() + prot2;
								prot3 = i.getQuant()*i.getProduto().getCarboidrato() + prot3;
							}
							 System.out.println(" " + prot + "g de proteínas " + prot2 + " g de gordura " + prot3 + " g de carboidrato.");		
					}
			    System.out.println();
		}


}

}
