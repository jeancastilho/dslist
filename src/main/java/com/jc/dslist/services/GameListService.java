package com.jc.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jc.dslist.dto.GameListDTO;
import com.jc.dslist.entities.Game;
import com.jc.dslist.entities.GameList;
import com.jc.dslist.respositories.GameListRepository;

@Service //Registra o "GameListService" como componente do sistema, habilitando para ser gerenciado pelo Framework e atc... 
public class GameListService {
	
	@Autowired //Injeta o GameListRepository para realizar busca
	private GameListRepository gameListRepository;

	
	
	@Transactional(readOnly = true) 
	public List<GameListDTO> findAll(){
		
		List<GameList> result = gameListRepository.findAll();
		
		return result.stream().map(x -> new GameListDTO(x)).toList(); 
	
	}
	
}
