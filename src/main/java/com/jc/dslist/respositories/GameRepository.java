package com.jc.dslist.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jc.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
