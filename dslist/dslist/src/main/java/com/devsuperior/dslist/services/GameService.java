package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameRepository;

// faz  registos no sistema 
@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	//nao bloquear o banco de dados para escrita
	@Transactional(readOnly = true)
	// chamar um item por id
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
		
		
	}
	
	
	@Transactional(readOnly = true)
	//Gustomizar a saida e faz uma busca no banco retornando os objetos
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	
	}

}
