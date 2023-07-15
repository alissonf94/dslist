package br.com.maisunifacisa.alissonfernandes.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maisunifacisa.alissonfernandes.dslist.entities.GameList;
import br.com.maisunifacisa.alissonfernandes.dslist.entities.GameListDTO;
import br.com.maisunifacisa.alissonfernandes.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	@Autowired
	GameListRepository  gameListRepository;
	
	public void insert (GameList list) {
		gameListRepository.save(list);
	}
	
	public List<GameListDTO>  findAll(){
		List<GameList> games = gameListRepository.findAll();
		List <GameListDTO> result = games.stream().map(p -> new GameListDTO(p)).toList();
		return result;
	}
	
}
