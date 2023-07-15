package br.com.maisunifacisa.alissonfernandes.dslist.entities;

public class GameListDTO {
	private Long id;
	private String name;
	
	public GameListDTO (GameList list) {
		id = list.getId();
		name = list.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
