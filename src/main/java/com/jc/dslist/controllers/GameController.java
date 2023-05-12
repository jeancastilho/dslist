package com.jc.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jc.dslist.dto.GameDTO;
import com.jc.dslist.dto.GameMinDTO;
import com.jc.dslist.services.GameService;

@RestController //configura a classe para ser um controlador
@RequestMapping(value = "/games") //mapeia o recurso
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public GameDTO finById(@PathVariable	 Long id){
		
		GameDTO result = gameService.findById(id);
		return result;
	}
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}

}