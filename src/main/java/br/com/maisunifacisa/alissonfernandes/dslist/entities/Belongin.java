package br.com.maisunifacisa.alissonfernandes.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belongin {
	
	@EmbeddedId
	private BelongingPK belongingPk = new BelongingPK();
	private Integer position;
	
	public Belongin(Game game, GameList gameList, Integer position) {
		belongingPk.setGame(game);
		belongingPk.setList(gameList);
		this.position = position;
	}

	public BelongingPK getBelongingPk() {
		return belongingPk;
	}

	public void setBelongingPk(BelongingPK belongingPk) {
		this.belongingPk = belongingPk;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}
	
	
}
