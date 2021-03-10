package it.polito.tdp.parole.model;
import java.util.*;

public class Parole {
    
	LinkedList<String> lista ;
	


	public Parole() {
		lista = new LinkedList<String>();
	}

	
	public void addParola(String p) {
		//TODO
		lista.add(p);	
	}
	
	public void removeParola(String s) {
		this.lista.remove(s);
	}
	
	public List<String> getElenco() {
		//TODO
		Collections.sort(lista);
		return lista;
	}
	
	public void reset() {
		// TODO
		this.lista.clear();
	}

}
