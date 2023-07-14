package br.com.maisunifacisa.alissonfernandes.dslist.entities.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maisunifacisa.alissonfernandes.dslist.entities.GameMinDTO;
import br.com.maisunifacisa.alissonfernandes.dslist.entities.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	@Autowired
	GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		return gameService.findAll();
	}
	
}
