package br.com.maisunifacisa.alissonfernandes.dslist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.maisunifacisa.alissonfernandes.dslist.entities.Game;
import br.com.maisunifacisa.alissonfernandes.dslist.entities.GameList;
import br.com.maisunifacisa.alissonfernandes.dslist.repositories.GameListRepository;
import br.com.maisunifacisa.alissonfernandes.dslist.repositories.GameRepository;
import br.com.maisunifacisa.alissonfernandes.dslist.services.GameListService;
import br.com.maisunifacisa.alissonfernandes.dslist.services.GameService;

@SpringBootApplication
public class DslistApplication implements CommandLineRunner {
	@Autowired
	GameListRepository lisRepository;
	@Autowired
	GameListService listService;
	
	@Autowired
	GameRepository gameRepository;
	
	@Autowired
	GameService gameService;
	public static void main(String[] args) {
		SpringApplication.run(DslistApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Game game  = new Game ("'Mass Effect Trilogy",4.8,2012,"luta","pc","https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/4.png","Jogo de lua muito top","lorem jogo naa alisso bnjjbj bjkhubhjke hvbhyved nom anmugio jejsedhbsdchbvdchbjvdhjewvhjevwdhjvbehdjvehjvehjvdhjevdhje");
		Game game1  = new Game ("Red Dead Redemption 2",4.8,2012,"familia","pc","https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/4.png","Jogo de lua muito top","lorem jogo naa alisso bnjjbj bjkhubhjke hvbhyved nom anmugio jejsedhbsdchbvdchbjvdhjewvhjevwdhjvbehdjvehjvehjvdhjevdhje");
		Game game2  = new Game ("The Witcher 3: Wild Hunt",4.8,2012,"Aventura","pc","https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/4.png","Jogo de lua muito top","lorem jogo naa alisso bnjjbj bjkhubhjke hvbhyved nom anmugio jejsedhbsdchbvdchbjvdhjewvhjevwdhjvbehdjvehjvehjvdhjevdhje");
		gameService.Insert(game);
		gameService.Insert(game1);
		gameService.Insert(game2);*/
		
		/*
		GameList gamelist = new GameList ("Aventura e RPG");
		GameList gamelist1 = new GameList ("Jogos de plataforma");
		
		listService.insert(gamelist);
		listService.insert(gamelist1);*/
		
	}
}
