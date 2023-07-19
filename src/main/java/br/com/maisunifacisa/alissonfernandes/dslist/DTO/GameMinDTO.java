package br.com.maisunifacisa.alissonfernandes.dslist.DTO;

import br.com.maisunifacisa.alissonfernandes.dslist.entities.Game;
import br.com.maisunifacisa.alissonfernandes.dslist.projections.GameMinProjection;

public class GameMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO () {}
	
	public GameMinDTO (Game game) {
		this.id = game.getId();
		this.title = game.getTitle();
		this.imgUrl = game.getImgUrl();
		this.shortDescription = game.getShortDescription();
	}
	
	public GameMinDTO (GameMinProjection gameMinProjection) {
		this.id = gameMinProjection.getId();
		this.title = gameMinProjection.getTitle();
		this.imgUrl = gameMinProjection.getImgUrl();
		this.shortDescription = gameMinProjection.getShortDescription();
	}
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}


}
