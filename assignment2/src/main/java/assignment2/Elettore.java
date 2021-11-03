package assignment2;

public class Elettore {

	List lista_candidati = new ArrayList();
	
	public static void setLista_candidati(String c) {
		
		lista_candidati.add(c); 
	}
	
	public static List<String> getLista_candidati() {
		
		return lista_candidati;	
	}
	
	String nome_elettore;
}