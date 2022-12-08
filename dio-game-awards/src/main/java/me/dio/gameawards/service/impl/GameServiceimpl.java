package me.dio.gameawards.service.impl;

import me.dio.gameawards.domain.model.Game;
import me.dio.gameawards.domain.model.gameRepository;
import me.dio.gameawards.service.GameService;
import me.dio.gameawards.service.exception.BusinessException;
import me.dio.gameawards.service.exception.NoContentException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GameServiceimpl implements GameService {

    @Autowired

    private gameRepository repository;
    @Override
    public List<Game> findAll() {
       List<Game> games =  repository.findAll();
        return games;
    }

    @Override
    public Game findByid(Long id) {
        Optional<Game> game = repository.findById(id);
        return game.orElseThrow(() -> new NoContentException());

       // if (game.isPresent()) {  posso fazer com o if o lambda ali em cima
        //    return game.get();
       //     }else {
         //   throw new NoContentException;
    //    }

    }

    @Override
    public void insert(Game Game) {
        if(Objects.nonNull(Game.getId())){
            throw new BusinessException("o ID é diferente de NULL na inclusão");
        }
        repository.save(Game);

    }

    @Override
    public void update(Long id, Game Game) {
        me.dio.gameawards.domain.model.Game gameDb = findByid(id);
        if(gameDb.getId().equals(Game.getId())){
            repository.save(Game);

        }else{
            throw new BusinessException("Os IDs para alteração são divergentes.");
        }

    }

    @Override
    public void delete(Long id) {
        Game gameDb = findByid(id);
        repository.delete(gameDb);

    }
}
