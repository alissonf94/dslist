package br.com.maisunifacisa.alissonfernandes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maisunifacisa.alissonfernandes.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
