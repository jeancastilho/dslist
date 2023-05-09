package com.jc.dslist.dto;

import com.jc.dslist.entities.Game;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}

	//instancia o contrutor(GameMinDTO) apartir do objeto "Game", copiando os dados do game para o DTO
	public GameMinDTO(Game entity) {
	    id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription(); 
	}

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
