package com.gameshelfv1.demo.repo;

import java.util.List;

import com.gameshelfv1.demo.pojo.Games;

public interface GameRepository {
    public List<Games> findAll();
}
