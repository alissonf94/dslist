package br.com.maisunifacisa.alissonfernandes.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.maisunifacisa.alissonfernandes.dslist.DTO.GameDTO;
import br.com.maisunifacisa.alissonfernandes.dslist.DTO.GameMinDTO;
import br.com.maisunifacisa.alissonfernandes.dslist.entities.Game;
import br.com.maisunifacisa.alissonfernandes.dslist.projections.GameMinProjection;
import br.com.maisunifacisa.alissonfernandes.dslist.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll (){
		List<Game> games = gameRepository.findAll();
		List<GameMinDTO> result = games.stream().map(p -> new GameMinDTO(p)).toList();
		return result;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findnById (Long id) {
		return new GameDTO (gameRepository.findById(id).get());
	}
	
	@Transactional(readOnly = true)
	public void Insert (Game game) {
		gameRepository.save(game);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByGameList (Long listId){
		List<GameMinProjection> games = gameRepository.searchByList(listId);
		List<GameMinDTO> result = games.stream().map(p -> new GameMinDTO(p)).toList();
		return result;
	}
}
