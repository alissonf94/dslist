package br.com.maisunifacisa.alissonfernandes.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maisunifacisa.alissonfernandes.dslist.DTO.GameListDTO;
import br.com.maisunifacisa.alissonfernandes.dslist.DTO.GameMinDTO;
import br.com.maisunifacisa.alissonfernandes.dslist.DTO.ReplacementDTO;
import br.com.maisunifacisa.alissonfernandes.dslist.services.GameListService;
import br.com.maisunifacisa.alissonfernandes.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	@Autowired
	GameListService listService;
	
	@Autowired
	GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return listService.findAll();
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gameService.findByGameList(listId);
		return result;
	}
	
	@PostMapping(value = "/{listId}/replacement")
	public void move(@PathVariable long listId, @RequestBody ReplacementDTO body ) {
		listService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	}
}