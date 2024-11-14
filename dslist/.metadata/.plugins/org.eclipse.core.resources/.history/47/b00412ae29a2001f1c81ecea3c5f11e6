package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDto {
	@Id
	// indica para o banco como ele vai gerar o ID
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String title;

	private Integer year;

	private String imgUrl;

	private String shortDescription;
	
	public GameMinDto() {
		
	}

	//puxar as informações no Game que foi importado
	public GameMinDto(Game entity) {
		
		id = entity.getId();
		title =  entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
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
