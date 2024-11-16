package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.entities.GameList;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDTO {
	@Id
	// indica para o banco como ele vai gerar o ID
	// uma versao do game so que em uma versao menor
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String title;

	private Integer year;

	private String imgUrl;

	private String shortDescription;
	
	public GameMinDTO() {
		
	}

	//puxar as informações no Game que foi importado
	public GameMinDTO(Game entity) {
		
		id = entity.getId();
		title =  entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public GameMinDTO(GameList x) {
		// TODO Auto-generated constructor stub
	}

	// necessario somente os get
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	
}
