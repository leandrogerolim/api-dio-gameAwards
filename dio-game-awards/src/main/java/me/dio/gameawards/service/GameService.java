package me.dio.gameawards.service;
import me.dio.gameawards.domain.model.Game;
import java.util.List;

public interface GameService {
    List<Game> findAll();

    Game findByid(Long id);

    void insert(Game game);

    void update(Long id, Game game);

    void delete(Long id);

}
