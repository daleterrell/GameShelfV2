package com.gameshelfv1.demo.controller;

import java.util.List;

import com.gameshelfv1.demo.pojo.Games;
import com.gameshelfv1.demo.repo.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    private GameRepository repo;

    @Autowired
    public GameController(GameRepository repo) {
        this.repo = repo;
    }

    @RequestMapping("/get-games")
    public List<Games> getGames() {

        List<Games> games = (List<Games>) repo.findAll();
        return games;
    }

}
