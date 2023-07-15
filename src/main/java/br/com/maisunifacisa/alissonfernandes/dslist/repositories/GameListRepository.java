package br.com.maisunifacisa.alissonfernandes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maisunifacisa.alissonfernandes.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
