package assignment2;

import java.util.ArrayList;
import java.util.List;

public class Elettore {

	List<String> lista_candidati = new ArrayList<String>();
	
	public void setLista_candidati(String c) {
		
		lista_candidati.add(c); 
	}
	
	public List<String> getLista_candidati() {
		
		return lista_candidati;	
	}
	
	String nome_elettore;
}