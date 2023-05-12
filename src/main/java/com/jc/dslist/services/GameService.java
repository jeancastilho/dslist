package com.jc.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jc.dslist.dto.GameDTO;
import com.jc.dslist.dto.GameMinDTO;
import com.jc.dslist.entities.Game;
import com.jc.dslist.projections.GameMinProjection;
import com.jc.dslist.respositories.GameRepository;

@Service //Registra o "GameService" como componente do sistema, habilitando para ser gerenciado pelo Framework e atc... 
public class GameService {
	
	@Autowired //Injeta o GameRepository
	private GameRepository gameRepository;

	@Transactional(readOnly = true) //Boas praticas para garantir que as operações com o BDA seka transacional respeitando a norma da ACID  
	public GameDTO findById(Long id) {
		
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true) 
	public List<GameMinDTO> findAll(){
		
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); 
		return dto;
	}
	
	@Transactional(readOnly = true) 
	public List<GameMinDTO> findByList(Long listId){
		
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList(); 

	}
	
}
