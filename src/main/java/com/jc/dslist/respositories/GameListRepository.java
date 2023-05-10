package com.jc.dslist.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jc.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
