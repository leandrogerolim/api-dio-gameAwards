package me.dio.gameawards.service;

import me.dio.gameawards.domain.model.game;

import java.util.List;

public interface GameService {
    List<game> findAll();

    game findByid(Long id);

    void insert(game Game);

    void update(Long id, game Game);

    void delete(Long id);

}
