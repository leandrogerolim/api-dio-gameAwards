package me.dio.gameawards.service.impl;

import me.dio.gameawards.domain.model.game;
import me.dio.gameawards.domain.model.gameRepository;
import me.dio.gameawards.service.GameService;
import me.dio.gameawards.service.exception.NoContentException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class GameServiceimpl implements GameService {

    @Autowired

    private gameRepository repository;
    @Override
    public List<game> findAll() {
       List<game> games =  repository.findAll();
        return games;
    }

    @Override
    public game findByid(Long id) {
        Optional<game> game = repository.findById(id);
        return game.orElseThrow(() -> new NoContentException());

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
