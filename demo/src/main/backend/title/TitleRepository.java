package org.aim.gameshelfv1.title;

import org.aim.gameshelfv1.publisher;
import org.aim.gameshelfv1.designer;

import org.springframework.data.repository.CrudRepository;

import org.aim.gameshelfv1.game;

public interface GameRepository extends CrudRepository<Game, Integer> {

}