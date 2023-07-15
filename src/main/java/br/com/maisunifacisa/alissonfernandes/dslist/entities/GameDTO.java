package br.com.maisunifacisa.alissonfernandes.dslist.entities;



public class GameDTO {
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platform;
	private String imgUrl;
	private Double score;
	
	public GameDTO () {}
	
	public GameDTO (Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		genre = entity.getGenre();
		platform = entity.getPlatform();
		imgUrl = entity.getImgUrl();
		score = entity.getScore();
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

	public String getGenre() {
		return genre;
	}

	public String getPlatform() {
		return platform;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public Double getScore() {
		return score;
	}
	
}
