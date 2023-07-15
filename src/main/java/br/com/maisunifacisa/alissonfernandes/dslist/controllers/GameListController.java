package br.com.maisunifacisa.alissonfernandes.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maisunifacisa.alissonfernandes.dslist.entities.GameListDTO;
import br.com.maisunifacisa.alissonfernandes.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	@Autowired
	GameListService listService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return listService.findAll();
	}
	
	
}
