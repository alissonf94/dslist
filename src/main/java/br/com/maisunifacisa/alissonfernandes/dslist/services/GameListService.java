package br.com.maisunifacisa.alissonfernandes.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.maisunifacisa.alissonfernandes.dslist.DTO.GameListDTO;
import br.com.maisunifacisa.alissonfernandes.dslist.entities.GameList;
import br.com.maisunifacisa.alissonfernandes.dslist.projections.GameMinProjection;
import br.com.maisunifacisa.alissonfernandes.dslist.repositories.GameListRepository;
import br.com.maisunifacisa.alissonfernandes.dslist.repositories.GameRepository;

@Service
public class GameListService {
	@Autowired
	GameListRepository  gameListRepository;
	
	@Autowired
	GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public void insert (GameList list) {
		gameListRepository.save(list);
	}
	
	@Transactional(readOnly = true)
	public List<GameListDTO>  findAll(){
		List<GameList> games = gameListRepository.findAll();
		List <GameListDTO> result = games.stream().map(p -> new GameListDTO(p)).toList();
		return result;
	}
	
	@Transactional
	public void move(Long lisId, int sourceIndex, int destinationIndex) {
		List<GameMinProjection> list = gameRepository.searchByList(lisId);
		
		GameMinProjection game = list.remove(sourceIndex);
		list.add(destinationIndex,game);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex > destinationIndex ? sourceIndex : destinationIndex;
		
		for(int x = min; x <= max; x++) {
			gameListRepository.updateBelongingPosition(lisId, list.get(x).getId(), x);
		}
	}
	
}
