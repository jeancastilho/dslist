package com.jc.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jc.dslist.dto.GameListDTO;
import com.jc.dslist.dto.GameMinDTO;
import com.jc.dslist.services.GameListService;
import com.jc.dslist.services.GameService;

@RestController //configura a classe para ser um controlador
@RequestMapping(value = "/lists") //mapeia o recurso
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}

}