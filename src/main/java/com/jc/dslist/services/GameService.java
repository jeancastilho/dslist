package com.jc.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jc.dslist.dto.GameMinDTO;
import com.jc.dslist.entities.Game;
import com.jc.dslist.respositories.GameRepository;

@Service //Registra o "GameService" como componente do sistema, habilitando para ser gerenciado pelo Framework e atc... 
public class GameService {
	
	@Autowired //Injeta o GameRepository
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll(){
		
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); 
		return dto;
	}
	
}
