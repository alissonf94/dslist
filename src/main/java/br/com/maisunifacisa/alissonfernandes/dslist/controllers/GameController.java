package br.com.maisunifacisa.alissonfernandes.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maisunifacisa.alissonfernandes.dslist.DTO.GameDTO;
import br.com.maisunifacisa.alissonfernandes.dslist.DTO.GameMinDTO;
import br.com.maisunifacisa.alissonfernandes.dslist.DTO.ReplacementDTO;
import br.com.maisunifacisa.alissonfernandes.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	@Autowired
	GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		return gameService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById (@PathVariable Long id) {
		return gameService.findnById(id);
	}
	
	
} 
