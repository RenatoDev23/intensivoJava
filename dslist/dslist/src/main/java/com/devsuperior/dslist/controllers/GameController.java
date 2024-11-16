package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameService;

//porta de entra do back-end
//indicando que esta class e cum controllador 
@RestController
//configuração do caminho a ser chamado 
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;


// chamar um item por id mapeamneto do metodo
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = gameService.findById(id);
		return result;
	}
	

	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
}