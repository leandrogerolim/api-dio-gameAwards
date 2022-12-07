package me.dio.gameawards.service.impl;

import me.dio.gameawards.domain.model.game;
import me.dio.gameawards.domain.model.gameRepository;
import me.dio.gameawards.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GameServiceimpl implements GameService {

    @Autowired

    private gameRepository repository;
    @Override
    public List<game> findAll() {
        return null;
    }

    @Override
    public game findByid(Long id) {
        return null;
    }

    @Override
    public void insert(game Game) {

    }

    @Override
    public void update(Long id, game Game) {

    }

    @Override
    public void delete(Long id) {

    }
}
