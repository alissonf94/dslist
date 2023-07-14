package br.com.maisunifacisa.alissonfernandes.dslist.entities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maisunifacisa.alissonfernandes.dslist.entities.Game;
import br.com.maisunifacisa.alissonfernandes.dslist.entities.GameMinDTO;
import br.com.maisunifacisa.alissonfernandes.dslist.entities.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	GameRepository gameRepository;
	
	public List<GameMinDTO> findAll (){
		List<Game> games = gameRepository.findAll();
		List<GameMinDTO> result = games.stream().map(p -> new GameMinDTO(p)).toList();
		return result;
	}
}
