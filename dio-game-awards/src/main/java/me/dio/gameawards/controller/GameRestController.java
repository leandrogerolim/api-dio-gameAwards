package me.dio.gameawards.controller;


import me.dio.gameawards.domain.model.Game;
import me.dio.gameawards.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameRestController {

@Autowired
    private   GameService businessLayer;





    @GetMapping("GAMES")

    public ResponseEntity <List<Game>> findAll(){
        List<Game> games = businessLayer.findAll();

        return ResponseEntity.ok(games);

    }
}
