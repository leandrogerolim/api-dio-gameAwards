package me.dio.gameawards.controller;


import me.dio.gameawards.controller.games.BaseRestController;
import me.dio.gameawards.domain.model.Game;
import me.dio.gameawards.domain.model.gameRepository;
import me.dio.gameawards.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameRestController extends BaseRestController  {

@Autowired
    private   GameService businessLayer;
    @Autowired
    private me.dio.gameawards.domain.model.gameRepository gameRepository;


    @GetMapping("games")
    public ResponseEntity <List<Game>> findAll(){
        List<Game> games = businessLayer.findAll();
        return ResponseEntity.ok(games);
    }
    @GetMapping("games/{id}")
    public ResponseEntity<Game> findById(@PathVariable Long id){
        Game game = businessLayer.findByid(id);
        return ResponseEntity.ok(game);
    }
    @PostMapping("games")
    public ResponseEntity<Game> insert(@RequestBody Game game){
        businessLayer.insert(game);
        return ResponseEntity.ok(game);
    }
    @PostMapping("games/{id}")
    public ResponseEntity<Game> update(@PathVariable Long id, @RequestBody Game game){
        businessLayer.update(id, game);
        return ResponseEntity.ok(game);
    }
    @DeleteMapping("games/{id}")
    public ResponseEntity<Game> delete(@PathVariable Long id){
        businessLayer.delete(id);
        return ResponseEntity.ok().build();
    }

}
